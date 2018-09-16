<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<style type="text/css">
	div{
	margin: 10px;
	}
	input{
		width: 200px;
	}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login.action" method="post">
		<div>
			<div>
				username:<input type="text" name="username" placeholder="Please enter your username">
			</div>
			<div>
				password:<input type="password" name="password" placeholder="Please enter your password">
			</div>
			<div>
				<input type="submit" value="login in">
			</div>
		</div>
	</form>
</body>
</html>