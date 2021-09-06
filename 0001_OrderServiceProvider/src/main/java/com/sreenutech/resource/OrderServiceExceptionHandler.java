package com.sreenutech.resource;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.sreenutech.resource.beans.OrderResp;

@Provider
public class OrderServiceExceptionHandler implements ExceptionMapper<OrderServiceException> {

	public Response toResponse(OrderServiceException e) {
		System.out.println("Entered into exception mapper");
		OrderResp resp = new OrderResp();
		resp.setStatusCode(400);
		resp.setDesc(e.getDesc());
		resp.setStatus(e.getStatus());
		return Response.status(400).entity(resp).build();
	}

}
