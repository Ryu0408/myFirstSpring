<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>신규 사원 등록</h1>
	<table border="1">
	<form action="#" method = "post">
		<tr>
			<th>EMPLOYEE_ID</th>
			<td><input type="number" name="employeeId"></td>
			<!-- VO내부와 일치하는 것으로 name을 만들어줘야함. -->
		</tr>
		<tr>
			<th>FIRST_NAME</th>
			<td><input type="text" name="firstName"></td>
		</tr>
		<tr>
			<th>LAST_NAME</th>
			<td><input type="text" name="lastName"></td>
		</tr>
		<tr>
			<th>EMAIL</th>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<th>PHONE_NUMBER</th>
			<td><input type="text" name="phonenumber"></td>
		</tr>
		<tr>
			<th>HIRE_DATE</th>
			<td><input type="date" name="hireDate"></td>
		</tr>	
		<tr>
			<th>JOB_ID</th>
			<td><input type="text" name="jobId"></td>
		</tr>
		<tr>
			<th>SALARY</th>
			<td><input type="number" name="salary"></td>
		</tr>	
		<tr>
			<th>COMMISSION_PCT</th>
			<td><input type="number" name="commissionPct" 
			step="0.1" min = "0" max="0.99"></td>
		</tr>
		<tr>
			<th>MANAGER_ID</th>
			<td><input type="number" name="managerId"></td>
		</tr>
		<tr>
			<th>DAPARTMENT_ID</th>
			<td><input type="number" name="departmentId"></td>
		</tr>
	</form>
	</table>
</body>
</html>