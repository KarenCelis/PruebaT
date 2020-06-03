package com.example.demo.integration;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class AuthenticateClient extends WebServiceGatewaySupport {

	
	public Response getClient(Client client ) {

	 
	    
	Response response = (Response) getWebServiceTemplate()
	        .marshalSendAndReceive("https://testsrv.credibanco.com/CheckOutWSWeb/CheckoutWSService", client,
	            new SoapActionCallback(
	                "http://tempuri.org/getUser"));

	    return response;
	  }

	
	
}
