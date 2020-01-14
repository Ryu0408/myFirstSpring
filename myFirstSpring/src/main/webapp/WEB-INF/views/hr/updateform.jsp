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
	<form action="update" method = "post">
		<tr>
			<th>EMPLOYEE_ID</th>
			<td><input type="number" name="employeeId" value="${emp.employeeId }" required></td>
			<!-- VO내부와 일치하는 것으로 name을 만들어줘야함. -->
		</tr>
		<tr>
			<th>FIRST_NAME</th>
			<td><input type="text" name="firstName" value="${emp.firstName }" required></td>
		</tr>
		<tr>
			<th>LAST_NAME</th>
			<td><input type="text" name="lastName" value="${emp.lastName }" required></td>
		</tr>
		<tr>
			<th>EMAIL</th>
			<td><input type="text" name="email" value="${emp.email }" required></td>
		</tr>
		<tr>
			<th>PHONE_NUMBER</th>
			<td><input type="text" name="phonenumber" value="${emp.phoneNumber }"required></td>
		</tr>
		<tr>
			<th>HIRE_DATE</th>
			<td><input type="date" name="hireDate" value="${emp.hireDate }" required></td>
		</tr>	
		<tr>
			<th>JOB_ID</th>
			<td>
				<select name="jobId">
					<c:forEach var="job" items="${jobId }">
						<c:if test="${emp.jobId == job.jobId }">
							<option value = "${job.jobId}" selected>${job.jobTitle }</option>
						</c:if>
						<c:if test="${emp.jobId != job.jobId }">
							<option value="${job.jobId}">${job.jobTitle}</option>
						</c:if>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<th>SALARY</th>
			<td><input type="number" name="salary" value="${emp.salary }" required></td>
		</tr>	
		<tr>
			<th>COMMISSION_PCT</th>
			<td><input type="number" name="commissionPct" 
			step="0.1" min = "0" max="0.99" value="${emp.commissionPct }" required></td>
		</tr>
		<tr>
			<th>MANAGER_ID</th>
			<td>
				<select name="managerId">
					<c:forEach var="manager" items="${managerId }">
						<c:if test="${emp.managerId == manager.managerId }">
							<option value="${manager.managerId}" selected>${manager.firstName}</option>
						</c:if>
						<c:if test="${emp.managerId != manager.managerId }">
							<option value="${manager.managerId}">${manager.firstName}</option>
						</c:if>
					</c:forEach>
				</select>
			</td>
				
		</tr>
		<tr>
			<th>DEPARTMENT_ID</th>
			<td>
				<select name ="departmentId">
					<c:forEach var="dept" items="${deptId }">
						<c:if test="${emp.departmentId == dept.departmentId }">
							<option value="${dept.departmentId}" selected>${dept.departmentName}</option>
						</c:if>
						<c:if test="${emp.departmentId != dept.departmentId }">
							<option value="${dept.departmentId}">${dept.departmentName}</option>
						</c:if>
					</c:forEach>
				</select>
			</td>
		</tr>
		<input type ="submit" value="제출">
	</form>
</table>
</body>
</html>