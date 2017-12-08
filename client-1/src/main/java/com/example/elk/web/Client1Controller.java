package com.example.elk.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Client1Controller {
	
	@Autowired RestTemplate template;

	@GetMapping(value = "/client1")
	public String client1() {
		ResponseEntity<String> result = template.getForEntity("http://client-2/client2", String.class);
		return result.getBody();
	}
	
	@GetMapping(value = "/calledByClient2")
	public String calledByClient2() {
		return "calledByClient2";
	}
	
}
