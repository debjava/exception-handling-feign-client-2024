package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.client.SampleFeignClient;

@Component
public class AutoRun {
	
	@Autowired
	private SampleFeignClient anotherClient;
	
	private void getMoreEmpDetails() {
		String response = "";
		try {
			response = anotherClient.getCountryDetailByCode("a124");
		} catch(Exception ex) {
			System.err.println("Handling exception--->"+ex.getMessage());
		}
		System.out.println("Another Feign Client Response: "+response);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void run() {
		System.out.println("Application started running ...");
		getMoreEmpDetails();
	}

}
