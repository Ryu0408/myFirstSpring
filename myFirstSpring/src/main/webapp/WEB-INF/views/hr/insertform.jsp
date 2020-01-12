<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<td><input type="number" name="employeeId" required></td>
			<!-- VO내부와 일치하는 것으로 name을 만들어줘야함. -->
		</tr>
		<tr>
			<th>FIRST_NAME</th>
			<td><input type="text" name="firstName" required></td>
		</tr>
		<tr>
			<th>LAST_NAME</th>
			<td><input type="text" name="lastName" required></td>
		</tr>
		<tr>
			<th>EMAIL</th>
			<td><input type="text" name="email" required></td>
		</tr>
		<tr>
			<th>PHONE_NUMBER</th>
			<td><input type="text" name="phonenumber" required></td>
		</tr>
		<tr>
			<th>HIRE_DATE</th>
			<td><input type="date" name="hireDate" required></td>
		</tr>	
		<tr>
			<th>JOB_ID</th>
			<td>
				<select name="jobId">
					<c:forEach var="job" items="${jobId }">
						<option value="${job.jobId}">
						${job.jobTitle}
						</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<th>SALARY</th>
			<td><input type="number" name="salary" required></td>
		</tr>	
		<tr>
			<th>COMMISSION_PCT</th>
			<td><input type="number" name="commissionPct" 
			step="0.1" min = "0" max="0.99" required></td>
		</tr>
		<tr>
			<th>MANAGER_ID</th>
			<td>
				<select name="managerId">
					<c:forEach var="manager" items="${managerId }">
						<option value="${manager.managerId}">
						${manager.firstName}
						</option>
					</c:forEach>
				</select>
			</td>
				
		</tr>
		<tr>
			<th>DEPARTMENT_ID</th>
			<td>
				<select name ="departmentId">
					<c:forEach var="dept" items="${deptId }">
						<option value="${dept.departmentId}">
						${dept.departmentName}
						</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<input type ="submit" value="제출">
	</form>
	</table>
</body>
</html>