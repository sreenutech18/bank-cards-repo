package com.sreenutech.resource.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderResp {
    private int statusCode;
	private String status;
	private String desc;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
