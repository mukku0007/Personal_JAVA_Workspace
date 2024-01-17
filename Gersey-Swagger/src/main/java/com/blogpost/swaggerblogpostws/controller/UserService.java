package com.blogpost.swaggerblogpostws.controller;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.blogpost.swaggerblogpostws.model.User;

import java.util.ArrayList;
import java.util.List;


@Path("/users")
@Api(value = "User Service", description = "REST Endpoints for User Service")
public class UserService 
{

    @GET
    @Path("/getAllUsers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "Mukesh", "Kumar");
        User user2 = new User(2, "Rana", "Omanshu");
        User user3 = new User(3, "Deepak", "Kumar");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

}