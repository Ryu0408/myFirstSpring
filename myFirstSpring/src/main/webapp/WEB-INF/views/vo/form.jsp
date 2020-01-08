<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보를 입력해주세요!</h1>
	<form action="vo" method="post">
		이름 : <input type = "text" name = "name" required><br>
		나이 : <input type = "number" min = "0" name = "age" required><br>
		아이디 : <input type = "text" name = "id" required><br>
		주소 : <input type = "text" name = "address" required><br>
		<input type = "submit" value = "가입">	
	</form>
</body>
</html>