package com.sreenutech.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sreenutech.resource.beans.OrderReq;
import com.sreenutech.resource.beans.OrderResp;

@Path("/orders")
public class OrderResource {
	
	
	@Path("/getOrders")
	@Produces({"application/xml","application/json"})
	@Consumes({"application/xml","application/json"})
	@POST
	public OrderResp getOrders(OrderReq req) throws OrderServiceException{
		OrderResp resp = null;
		if( req == null || req.getOid() == null ){
			throw new OrderServiceException("400", "invalid order id");
		}
		else{
			resp = new OrderResp();
			resp.setStatusCode(200);
			resp.setStatus("delivered");
			resp.setDesc("good product");
		}
		return resp;
		
	}

}
