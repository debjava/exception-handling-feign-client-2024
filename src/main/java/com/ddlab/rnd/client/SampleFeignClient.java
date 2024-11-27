package com.ddlab.rnd.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "AnotherFeignClientName", 
	url = "http://localhost:8081/sample")
public interface SampleFeignClient {

	// This method is used when external service is throwing exception
	@GetMapping("/v1/country/{countryCode}")
	String getCountryDetailByCode(@PathVariable("countryCode") String countryCode);

}
