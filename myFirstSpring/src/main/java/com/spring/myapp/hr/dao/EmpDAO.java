package com.spring.myapp.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.myapp.hr.vo.EmployeeVO;

@Repository
public class EmpDAO implements IEmpDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class EmpMapper implements RowMapper<EmployeeVO>{
		
		@Override
		public EmployeeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeVO emp = new EmployeeVO();
			
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setPhoneNumber(rs.getString("phone_number"));
			emp.setHireDate(rs.getDate("hire_date"));
			emp.setJobId(rs.getString("job_id"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setCommissionPct(rs.getDouble("commission_pct"));
			emp.setManagerId(rs.getInt("manager_id"));
			emp.setDepartmentId(rs.getInt("department_id"));
			
			return emp;
		}
	}
	
	@Override
	public int getEmpCount(){
		String sql = "select count(*) from employees";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	@Override
	public int getEmpCount(int deptid){
		String sql = "select count(*) from employees where DEPARTMENT_ID = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptid);
	}

	@Override
	public List<EmployeeVO> getEmplist() {
		String sql = "select * from employees";
		return jdbcTemplate.query(sql, new EmpMapper());
	}

	@Override
	public EmployeeVO getEmpList(int empid) {
		String sql = "select * from employees where EMPLOYEE_ID = ?";
		return jdbcTemplate.queryForObject(sql, new EmpMapper(), empid);
	}
	
	
}
