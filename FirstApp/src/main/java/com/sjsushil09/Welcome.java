package com.sjsushil09;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@RequestMapping("/welcome")	
	public String greeting() {
		return "Hey there..!!";
	}
	
}
