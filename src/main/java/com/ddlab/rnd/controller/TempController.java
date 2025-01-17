package com.ddlab.rnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.client.SampleFeignClient;

@RestController
public class TempController {
	
	@Autowired
	private SampleFeignClient anotherClient;
	
	private void getMoreEmpDetails() {
		String response = anotherClient.getCountryDetailByCode("a124");
		System.out.println("Another Feign Client Response: "+response);
	}
	
	@GetMapping(path = "/hi")
	public ResponseEntity<String> getSomeValue() {
		getMoreEmpDetails();
		return new ResponseEntity<String>("someValue", HttpStatus.OK);
	}

}