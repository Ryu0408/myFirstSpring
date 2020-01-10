package com.spring.myapp.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.spring.myapp.hr.service.IEmpService;
import com.spring.myapp.hr.vo.EmployeeVO;

@Controller
public class EmpController {
	
	@Autowired
	IEmpService empService;
	
	@RequestMapping(value = "hr/count", method = RequestMethod.GET)
	public String getEmpCount(
			@RequestParam(value = "deptid", required = false, defaultValue="0") int deptid,
			Model model) {//required = false 는 depoit에 반드시 들어갈 필요는 없다 넣어도 그만 안넣어도 그만
						//안들어왔을 경우는 0이다
		if(deptid==0) {
			model.addAttribute("count",empService.getEmpCount());
		}else {
			model.addAttribute("count",empService.getEmpCount(deptid));
		}
		return "hr/count";
	}
	
	@RequestMapping(value = "hr/list", method = RequestMethod.GET)
	public String getAllEmps(Model model) {
		//List<EmployeeVO> list = empService.getEmplist();
		//model.addAttribute("list",list);
		model.addAttribute("list", empService.getEmplist());
		return "hr/list";
	}
}
