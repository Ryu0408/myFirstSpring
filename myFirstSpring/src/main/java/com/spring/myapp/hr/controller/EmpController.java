package com.spring.myapp.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	/*
	 * hr/다음에 @PathVariable을 이용해서 employeeId를 처리해주세요
	 * getEmpList 메서드를 호출해주세요
	 * view.jsp 파일에서 우선 출력만 간단하게 해주세요.
	 */
	@RequestMapping(value = "hr/{employeeId}", method = RequestMethod.GET)
	public String getEmpInfo(@PathVariable int employeeId, Model model) {
		model.addAttribute("emp", empService.getEmpList(employeeId));
		return "hr/view";
	}
	
	/*
	 * insertEmp메서드를 만들어주세요
	 * 이 메서드는 form으로 연결된 메서드이기 떄문에 따로 파라미터를 입력바딪 않고
	 * 메서드는 GET방식을 사용합니다.
	 * 접속주소는 /hr/insert를 사용합니다.
	 */
	@RequestMapping(value = "hr/insert", method = RequestMethod.GET)
	public String insertEmp(Model model) {
		model.addAttribute("deptId",empService.getAllDepId());
		model.addAttribute("managerId", empService.getAllManagerId());
		model.addAttribute("jobId",empService.getAllJobId());
		return "hr/insertform";
	}
	
	@RequestMapping(value = "hr/insert", method = RequestMethod.POST)
	public String insertEmp(EmployeeVO emp, Model model) {
		empService.insertEmp(emp);
		return "redirect:list";
	}
	
	@RequestMapping(value = "hr/delete", method = RequestMethod.GET)
	public String deleteEmp(int empid, Model model) {
		model.addAttribute("emp", empService.getEmpList(empid));
		return "hr/deleteform";
	}
	
	@RequestMapping(value = "hr/delete", method = RequestMethod.POST)
	public String deleteEmp(int empid, String email, Model model) {
		empService.deleteEmp(empid, email);
		return "redirect:list";
	}
	
	@RequestMapping(value = "hr/update", method = RequestMethod.GET)
	public String updateEmp(int empid, Model model) {
		EmployeeVO emp = empService.getEmpList(empid);
		
		model.addAttribute("deptId",empService.getAllDepId());
		model.addAttribute("managerId", empService.getAllManagerId());
		model.addAttribute("jobId",empService.getAllJobId());
		model.addAttribute("emp", emp);
		return "hr/updateform";
	}
	
	@RequestMapping(value = "hr/update", method = RequestMethod.POST)
	public String updateEmp(EmployeeVO emp, Model model) {
		empService.updateEmp(emp);
		return "redirect:list";
	}
}
