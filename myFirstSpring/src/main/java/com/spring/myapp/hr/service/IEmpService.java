package com.spring.myapp.hr.service;

import java.util.List;

import com.spring.myapp.hr.vo.EmployeeVO;

public interface IEmpService {
	
	int getEmpCount();
	int getEmpCount(int deptid);
	List<EmployeeVO> getEmplist();
	EmployeeVO getEmpList(int empid);


}
