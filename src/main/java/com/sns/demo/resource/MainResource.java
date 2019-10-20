package com.sns.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main/test")
public class MainResource {
	
	@GetMapping
	public  String test() {
		return "Hello QBurst";
	}

}
