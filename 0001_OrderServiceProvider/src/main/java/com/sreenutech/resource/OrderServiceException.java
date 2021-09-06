package com.sreenutech.resource;

public class OrderServiceException extends Exception {
	
	private String status;
	private String desc;
	
	public OrderServiceException(String status,String desc){
		this.status = status;
		this.desc = desc;
	}

	public String getStatus() {
		return status;
	}

	public String getDesc() {
		return desc;
	}

	
}
