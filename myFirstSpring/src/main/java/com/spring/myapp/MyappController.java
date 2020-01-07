package com.spring.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyappController {
	
	@RequestMapping(value="goA")
	public String goA(Model model) {
		return "A";
	}
	
	@RequestMapping(value="goB", method= {RequestMethod.POST, RequestMethod.GET})
	public String goB(int getnum,Model model) {
		System.out.println(getnum);
		return "B";
	}
}
