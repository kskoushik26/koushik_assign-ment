package com.koushik.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.koushik.messenger.model.Message;
import com.koushik.messenger.service.MessageService;

@Path("/messages")
public class MessageResource 
{
	MessageService messageservice = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
 public List<Message> getMessage(){
	 return messageservice.getAllMessage(); 
 }
}
