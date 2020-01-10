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
	<table border="1">
		<tr>
			<th>EMPLOYEE_ID</th>
			<th>FIRST_NAME</th>
			<th>LAST_NAME</th>
			<th>EMAIL</th>
			<th>POHNE_NUMBER</th>
			<th>HIRE_DATE</th>
			<th>JOB_ID</th>
			<th>SALARY</th>
			<th>COMMISSION_PCT</th>
			<th>MANAGER_ID</th>
			<th>DEPARTMENT_ID</th>
		</tr>
		<c:forEach var="emp" items="${list }">
		<tr>
			<th><a href="/hr/${emp.employeeId}">${emp.employeeId }</a></th>
			<th>${emp.firstName}</th>
			<th>${emp.lastName}</th>
			<th>${emp.email}</th>
			<th>${emp.phoneNumber}</th>
			<th>${emp.hireDate}</th>
			<th>${emp.jobId}</th>
			<th>${emp.salary}</th>
			<th>${emp.commissionPct}</th>
			<th>${emp.managerId} </th>
			<th>${emp.departmentId}</th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>