package com.spring.myapp.hr.dao;

import java.util.List;

import com.spring.myapp.hr.vo.EmployeeVO;

public interface IEmpDAO {

	int getEmpCount();
	int getEmpCount(int deptid);
	List<EmployeeVO> getEmplist();
}
