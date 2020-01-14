package com.spring.myapp.hr.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.spring.myapp.hr.vo.EmployeeVO;

public interface IEmpDAO {

	int getEmpCount();
	int getEmpCount(@Param("deptid") int deptid);
	List<EmployeeVO> getEmplist();
	EmployeeVO getEmpList(int empid);
	void insertEmp(EmployeeVO emp);
	
	void deleteJobHistory(int empid);
	
	void deleteEmp(int empid, String email);
	void updateEmp(EmployeeVO emp);
	
	////////////////////////////////////
	List<Map<String, Object>> getAllDepId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
}
