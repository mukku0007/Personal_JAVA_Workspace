package com.jersey.swagger.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jersey.swagger.model.Item;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@Path("product")
@Api(tags= {"JaxRs"})
@Produces(MediaType.APPLICATION_JSON)
@ApiResponses(value = {
		@ApiResponse(code=200, message="OK"),
		@ApiResponse(code=201, message="Created"),
		@ApiResponse(code=202, message="Accepted"),
		@ApiResponse(code=400, message="Bad Request"),
		@ApiResponse(code=401, message="Unauthorized"),
		@ApiResponse(code=408, message="Request Timeout"),
		@ApiResponse(code=429, message="Too Many Requests"),
		@ApiResponse(code=502, message="Bad Gateway"),
		@ApiResponse(code=503, message="Service Unavailable"),
	})

public class Product 
{
public List<Item> list_item (){
		
		List<Item> pro = new ArrayList<Item>();
		
		pro.add(new Item(1,"TV",19999));
		pro.add(new Item(2, "Mobile",9999));
		pro.add(new Item(3, "Fan",1999));
		
		return pro;		
	}
	
	@ApiOperation(value="Get List of Products", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_XML)
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Item> get(){
		return list_item();				
	}
	
	
	@ApiOperation(value="Add Product", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Item> post(Item item){
		
		List<Item> pro = list_item();
		
		pro.add(new Item(item.getId(), item.getName(), item.getPrice()));
		
		return pro;				
	}

	@ApiOperation(value="Saved Product By Id, Name, Price", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	@POST
	@Path("url/{id}&{name}&{price}")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Item> post_url(
			@PathParam("id") int id,
			@PathParam("name") String name,
			@PathParam("price") double price) {
		
		List<Item> pro = list_item();
		
		pro.add(new Item(id, name, price));
		
		return pro;				
	}
	
	@ApiOperation(value="Post Record", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)	
    @POST
    @Path("/response")    
    public Response postRecord(List<Item> pro){

        return Response.status(201).entity(pro).type(MediaType.APPLICATION_JSON).build();
    }
    
	@ApiOperation(value="Update Product", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	@PUT
	public List<Item> put(Item item) {
		
		List<Item> list_item = list_item();
		
    	for (Item i : list_item) {
    		
    		if (i.getId() == item.getId()) {
    			
    			i.setPrice(item.getPrice());
    		}    		
    	}
    	
		return list_item;
	}
	
	
	@ApiOperation(value="Delete Product", consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	@DELETE
	public List<Item> delete(Item item) {

		List<Item> list_item = list_item();
		
    	for (Iterator<Item> iterator_pro =  list_item.iterator(); iterator_pro.hasNext(); ) {
    		
    		Item it = iterator_pro.next();
    		
    		if(it.getId() == item.getId()) {
    			iterator_pro.remove();
    		}   		
    	}
		return list_item;
	}
}
