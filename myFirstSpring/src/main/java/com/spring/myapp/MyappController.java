package com.spring.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyappController {
	
	@RequestMapping(value="goA")
	public String goA(Model model) {
		return "A";
	}
}
