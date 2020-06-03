package com.example.demo.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;



public class ConfigurationSOAP {
	
	@Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    // this package must match the package in the <generatePackage> specified in
	    // pom.xml
	    marshaller.setContextPath("com.example.demo.dtos");
	    return marshaller;
	  }
	 
	  @Bean
	 public AuthenticateClient aClient(Jaxb2Marshaller marshaller) {
		AuthenticateClient client = new AuthenticateClient();
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  }
	

}
