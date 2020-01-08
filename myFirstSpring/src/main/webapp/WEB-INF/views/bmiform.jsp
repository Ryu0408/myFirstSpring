<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "goBMI" method = "post">
		체중(Kg) : <input type = "number" name = "kg" step = "0.1"> 
		키(Cm) : <input type = "number" name = "cm" step = "0.1"> 
		<input type = "submit" value = "BMI지수계산">
	</form>
</body>
</html>