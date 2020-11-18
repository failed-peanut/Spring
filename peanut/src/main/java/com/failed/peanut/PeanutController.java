package com.failed.peanut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeanutController {
	
	@GetMapping("/")
	public String getPeanuts() {
		return "peanut";
	}

}
