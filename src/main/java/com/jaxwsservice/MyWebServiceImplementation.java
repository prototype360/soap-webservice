package com.jaxwsservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class MyWebServiceImplementation {

	@WebMethod
	public String myGreetingMessage(String mystr) {
		return "Hello, " + mystr + ". Welcome to the world of Web Services! ";
	}
}
