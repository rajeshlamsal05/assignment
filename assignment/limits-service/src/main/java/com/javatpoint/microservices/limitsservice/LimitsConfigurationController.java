package com.javatpoint.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	//This is used if we want to return value from below, type localhost:8080/limitss in browser
	@GetMapping("/limitss")
	public LimitConfiguration rretrieveLimitsFromConfigurations() {
		return new LimitConfiguration(1000, 1);
	}
	
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
	
}
