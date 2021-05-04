package com.org;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class SpringController {
	public String welcome() {
		return "index";
	}
}
