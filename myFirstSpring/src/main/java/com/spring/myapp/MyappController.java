package com.spring.myapp;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.vo.SampleVO;
import com.spring.vo.SampleVOlist;

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
	 * MyappController 파일에 섭씨 온도를 입력할 경우 화씨 ㅜㅜ온도로 바궈서 출력해주는 페이지를 작성해보도록 하겠습니다.
	 * 화씨 -> 섭씨 변환 공식은
	 * 섭씨온도 = (화씨온도 -32) / 1.8입니다.
	 */
	
	@RequestMapping(value="goC", method= {RequestMethod.POST, RequestMethod.GET})
	public String goC(double celsius,Model model) {
		double fahrenheit = (celsius - 32) / 1.8;
		model.addAttribute("f", fahrenheit);
		return "C";
	}
	
	@RequestMapping(value="ctofform",  method= {RequestMethod.POST, RequestMethod.GET})
	public String goForm1(Model model) {
		return "ctofform";
	}
	
	/*
	 * 문제
	 * MyappController 파일에 BMI지수를 측정해주는 프로그램을 만들겠습니다
	 * BMI 공식 = 체중 / 키(M)의 제곱
	 * 키는 M 이기 떄문에 예를들어 175cm로 입력시 1.75로 변환되어야 합니다.
	 * form과 실제로 입력했을때 결과가 나올 페이지 두개를 모두 작성하세요/.
	 */
	
	@RequestMapping(value = "bmiform",  method= {RequestMethod.POST, RequestMethod.GET})
	public void gobmiform(Model model) {}
	
	@RequestMapping(value = "goBMI", method= {RequestMethod.POST, RequestMethod.GET})
	public String gobmi(double kg, double cm, Model model) {
		double m = cm/100;
		double bmi = kg / (m*m);
		model.addAttribute("bmi",bmi);
		return "goBMI";
	}
	
	@RequestMapping(value = "pathtest/{page}")
	public String pathTest(@PathVariable int page, Model model) {
		model.addAttribute("page",page);
		return "path";
	}
	
	@RequestMapping(value = "getlist", method= {RequestMethod.POST, RequestMethod.GET})
	public String listTest(@RequestParam("array") ArrayList<String> array, Model model) {
		model.addAttribute("array",array);
		return "getlist";
	}
	
	@RequestMapping(value = "vo", method = {RequestMethod.POST})
	public String showvo(SampleVO samplevo, Model model) {
		model.addAttribute("samplevo", samplevo);
		return "vo/showvo";
	}
	
	@RequestMapping(value = "vo", method = {RequestMethod.GET})
	public String showvo(Model model) {
		return "vo/form";
	}
	/*
	 * 문제
	 * 
	 * 현재 vo라는 주소로 접근했을 때 SampleVO 입력에 따른 결과를 볼 수 있는 showvo 메서드를 호출하도록 설계했습니다.
	 * 단 결과를 보여주는 showvo는 POST방식에만 반응합니다.
	 * 따라서 form으로 이동하는 showvo파일을 작성해 결과창으로 자료를 전송할 수있도록 코드를 작성해보세요
	 */
	
	@RequestMapping(value ="volist", method= RequestMethod.GET)
	public String showListVo(SampleVOlist list, Model model){
		System.out.println(list);
		model.addAttribute("list",list);
		return "vo/volist";
	}
}
