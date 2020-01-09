package com.spring.myapp.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.myapp.hr.dao.IEmpDAO;
import com.spring.myapp.hr.service.IEmpService;

@Repository
public class EmpService implements IEmpService {

	@Autowired
	IEmpDAO empDAO;

	@Override
	public int getEmpCount() {
		return empDAO.getEmpCount();
	}
}
