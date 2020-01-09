package com.spring.myapp.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.myapp.hr.service.IEmpService;

@Controller
public class EmpController {
	
	@Autowired
	IEmpService empService;
	
	@RequestMapping(value = "hr/count", method = RequestMethod.GET)
	public String getEmpCount(Model model) {
		int count = empService.getEmpCount();
		model.addAttribute("count", count);
		empService.getEmpCount();
		return "hr/count";
	}
}
