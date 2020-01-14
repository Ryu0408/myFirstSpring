package com.spring.myapp.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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
	
	/*
	 * UPDATE 구문 작성 시 HIRE_DATE를 집어넣는 구간에는 ?대신 SYSDATE를 넣어주세요
	 * 나머지 경우는 모두 preparedstatement구문으로 작성합니다.
	 */
	@Override
	public void insertEmp(EmployeeVO emp) {
		String sql = "insert into employees (employee_id, "
				+ "first_name, last_name, email, phone_number, "
				+ "hire_date, job_id, salary, commission_pct, "
				+ "manager_id, department_id) "
				+ "values(?,?,?,?,?,SYSDATE,?,?,?,?,?)";
		jdbcTemplate.update(sql,
				emp.getEmployeeId(),
				emp.getFirstName(),
				emp.getLastName(),
				emp.getEmail(),
				emp.getPhoneNumber(),
				emp.getJobId(),
				emp.getSalary(),
				emp.getCommissionPct(),
				emp.getManagerId(),
				emp.getDepartmentId());
	}

	@Override
	public List<Map<String, Object>> getAllDepId() {
		String sql = "SELECT department_id as departmentId, "
				+ "department_name as departmentName "
				+ "from departments order by department_name";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		String sql = "SELECT job_id as jobId, "
				+ "job_title as jobTitle "
				+ "from jobs order by job_title";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		String sql = "select "
					+"d.manager_id as managerId, e.first_name as firstName "
					+"FROM departments d join employees e "
					+"on d.manager_id = e.employee_id "
					+"order by e.first_name";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void deleteEmp(int empid, String email) {
		String sql = "delete FROM employees WHERE employee_id=? and email=?";
		jdbcTemplate.update(sql, empid, email);
	}

	@Override
	public void updateEmp(EmployeeVO emp) {
		String sql = "UPDATE employees "
				+"SET first_name=?, last_name=?, email=?, "
				+"phone_number=?, hire_date=?, job_id=?, "
				+"salary=?, commission_pct=?, manager_id=?, " 
				+"department_id=? WHERE employee_id=?";
		jdbcTemplate.update(sql,
				emp.getFirstName(),
				emp.getLastName(),
				emp.getEmail(),
				emp.getPhoneNumber(),
				emp.getHireDate(),
				emp.getJobId(),
				emp.getSalary(),
				emp.getCommissionPct(),
				emp.getManagerId(),
				emp.getDepartmentId(),
				emp.getEmployeeId());
				
	}
}
