<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="item" items="${list }">
		<hr/>
		이름 : ${item.name }
		나이 : ${item.age }
		아이디 : ${item.id }
		주소 : ${item.address } 
		
	
	</c:forEach>
</body>
</html>