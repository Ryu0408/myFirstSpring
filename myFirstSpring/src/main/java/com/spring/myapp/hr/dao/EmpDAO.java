package com.spring.myapp.hr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO implements IEmpDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int getEmpCount(){
		String sql = "select count(*) from employees";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
}
