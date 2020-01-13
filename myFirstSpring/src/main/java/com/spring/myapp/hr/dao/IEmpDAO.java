package com.spring.myapp.hr.dao;

import java.util.List;
import java.util.Map;

import com.spring.myapp.hr.vo.EmployeeVO;

public interface IEmpDAO {

	int getEmpCount();
	int getEmpCount(int deptid);
	List<EmployeeVO> getEmplist();
	EmployeeVO getEmpList(int empid);
	void insertEmp(EmployeeVO emp);
	void deleteEmp(int empid, String email);
	
	////////////////////////////////////
	List<Map<String, Object>> getAllDepId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
}
