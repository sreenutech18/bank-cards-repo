package com.sreenutech.resource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sreenutech.resource.beans.OrderReq;

public class MarshallingDemo {

	public static void main(String[] args) throws JAXBException {
		
		System.out.println(" main() method ");
		JAXBContext context = JAXBContext.newInstance(OrderReq.class);
		Marshaller marshaller = context.createMarshaller();

		OrderReq req = new OrderReq();
		req.setOid("1234");
		req.setName("mobile");
		
		marshaller.marshal(req, System.out);
	}

}
