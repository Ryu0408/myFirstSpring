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
		model.addAttribute("getnum", getnum);
		return "B";
	}
	
	/*
	 * 문제
	 * MyappController 파일에 섭씨 온도를 입력할 경우 화씨 온도로 바궈서 출력해주는 페이지를 작성해보도록 하겠습니다.
	 * 화씨 -> 섭씨 변환 공식은
	 * 섭씨온도 = (화씨온도 -32) / 1.8입니다.
	 */
	
	@RequestMapping(value="goC", method= {RequestMethod.POST, RequestMethod.GET})
	public String goC(double celsius,Model model) {
		double fahrenheit = (celsius - 32) / 1.8;
		model.addAttribute("f", fahrenheit);
		return "C";
	}
	
	@RequestMapping(value="ctofform")
	public String goForm1(Model model) {
		return "ctofform";
	}
}
