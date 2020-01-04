package com.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 
 * @author aranza
 * @see Jersey
 * @apiNote You need to have in your Lib folder (inside WebContent) various jars form Jersey's apis. (Folders; api, ext and lib)
 *
 */
@Path("/Messages")
public class Mensajes {
	
	@Path ("/welcomeMessage")
		//http://localhost:8080/Exercise43REST/Messages/welcomeMessage you need to access to the specific method. 
	@GET
	public String sayHello() {
		return "Hi Cyan";
	}
}
