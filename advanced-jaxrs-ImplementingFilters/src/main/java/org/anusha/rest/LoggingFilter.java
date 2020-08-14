package org.anusha.rest;

import javax.ws.rs.ext.Provider;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;


@Provider
public class LoggingFilter implements ContainerRequestFilter,ContainerResponseFilter{

	
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Request Filter");
		System.out.println("Headers: " + requestContext.getHeaders());
		
	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		System.out.println("Response Filter");
		System.out.println("Headers: " + responseContext.getHeaders());
		
		
	}
	
	

}
