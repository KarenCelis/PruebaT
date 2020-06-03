package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.integration.AuthenticateClient;



@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class AuthenticateController {

	
	@Autowired	
	private AuthenticateClient clientS;
	
	
    @PostMapping(path = "/sub")
    public ResponseEntity<Response> ClieentP(@RequestBody Client client) {
    	Response response =  clientS.getUser(client);
      
       
    	return ResponseEntity.ok(response);
    }

}
