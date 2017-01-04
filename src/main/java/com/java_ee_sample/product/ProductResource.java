package com.java_ee_sample.product;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/product")
public class ProductResource {
	@Inject
	ProductService service;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll(){
		List<Product> products = service.getAll();
		return Response.status(200).entity(products).build();
	}
	
	
}
