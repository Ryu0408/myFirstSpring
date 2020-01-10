package com.spring.myapp.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.myapp.hr.dao.IEmpDAO;
import com.spring.myapp.hr.service.IEmpService;
import com.spring.myapp.hr.vo.EmployeeVO;

@Repository
public class EmpService implements IEmpService {

	@Autowired
	IEmpDAO empDAO;

	@Override
	public int getEmpCount() {
		return empDAO.getEmpCount();
	}
	
	@Override
	public int getEmpCount(int deptid){
		return empDAO.getEmpCount(deptid);
	}

	@Override
	public List<EmployeeVO> getEmplist() {
		return empDAO.getEmplist();
	}

	@Override
	public EmployeeVO getEmpList(int empid) {
		return empDAO.getEmpList(empid);
	}

	@Override
	public void insertEmp(EmployeeVO emp) {
		empDAO.insertEmp(emp);
	}
}
