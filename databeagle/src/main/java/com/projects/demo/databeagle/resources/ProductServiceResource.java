package com.projects.demo.databeagle.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.projects.demo.databeagle.model.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Path("/productservice") 
@Api("/Product Service")
@SwaggerDefinition(tags = {@Tag(name = "Product Service", description="Swagger API For Product Service")})
public class ProductServiceResource {

@GET
@Path("/get_all_products") 
@Produces(MediaType.APPLICATION_JSON) 
@ApiOperation(value="Get List of All Product")
public List<Product> getProducts() 
{
	return getProductList();
}

private List<Product> getProductList() 
{	
	List<Product> productList = new ArrayList<>();
 
		Product product1 = new Product();
		product1.setId(101);
		product1.setName("TV");
		product1.setPrice(20000);
		productList.add(product1);
	
		Product product2 = new Product(); 
		product2.setId(102);
		product2.setName("Smartphone");
		product2.setPrice(10000);  
		productList.add(product2);
		return productList;
}

@ApiOperation(value="Add New Product")
@POST
@Path("/add_products") 
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public List<Product> post(Product product)
{	
	List<Product> pro = getProducts();
	pro.add(new Product(product.getId(),product.getName(), product.getPrice()));	
	return pro;				
}

@ApiOperation(value="Update Product")
@PUT
@Path("/update_products") 
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public List<Product> put(Product product) 
{	
	List<Product> getProducts = getProducts();
	for (Product p : getProducts) 
	{	
		if (p.getId() == product.getId())
		{		
			p.setPrice(product.getPrice());
		}    		
	}
	return getProducts;
}

@ApiOperation(value="Delete Product")
@DELETE
@Path("/delete_products") 
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public List<Product> delete(Product product) {

	List<Product> getProducts = getProducts();
	
	for (Iterator<Product> iterator_pro =  getProducts.iterator(); iterator_pro.hasNext(); ) {
		
		Product it = iterator_pro.next();
		
		if(it.getId() == product.getId()) {
			iterator_pro.remove();
		}   		
	}
	return getProducts;
}

}