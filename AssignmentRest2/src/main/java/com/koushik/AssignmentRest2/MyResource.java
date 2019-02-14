package com.koushik.AssignmentRest2;

import javax.ws.rs.FormParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String validate(@FormParam("userName") String User , @FormParam("password") String password)
    {
    	if (User.equals("koushik")&&password.equals("12345"))
    	{
    		return "valid";
    	}
    	else
    	{
        return "Invalid user";
    }
}
}
