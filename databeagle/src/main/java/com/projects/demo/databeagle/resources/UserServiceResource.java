package com.projects.demo.databeagle.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import com.projects.demo.databeagle.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Path("/userservice")
@Api("/User Service")
@SwaggerDefinition(tags = {@Tag(name = "User Service", description="Swagger API For User Service")})
public class UserServiceResource {

	@GET
	@Path("/users") 
	@Produces(MediaType.APPLICATION_JSON) 
	public List<User> getUsers() {
	return getUsersList();
	}

	private List<User> getUsersList() {	
	List<User> userList = new ArrayList<>();
	
	User user1 = new User();
	user1.setFirstname("Mukesh");
	user1.setLastname("Kumar");
	userList.add(user1);
	
	User user2 = new User();
	user2.setFirstname("Rakesh");
	user2.setLastname("Kumar");
	userList.add(user2);
	
	User user3 = new User();
	user3.setFirstname("Rana");
	user3.setLastname("Omanshu");
	userList.add(user3);
	
	return userList;
	}
	

}
