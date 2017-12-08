package com.example.elk.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
public class Client2Controller {
	
	@Autowired RestTemplate template;

	@GetMapping(value = "/client2")
	public String client2() {
//		ResponseEntity<String> result = template.getForEntity("http://client-3/client3", String.class);
//		return result.getBody();
		
		return "CLIENT2";
	}
	
	@GetMapping(value = "/client2CallClient1")
	public String client2CallClient1() {
		ResponseEntity<String> result = template.getForEntity("http://client-1/calledByClient2", String.class);
		return result.getBody();
	}
	
	@GetMapping(value = "/client2-1")
	public String client2_1() {
		return "CLIENT2-1";
	}
	
}
