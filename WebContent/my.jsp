<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>welcome:${user.username}</div>
		<div>
			<h1>your book list</h1>
			<table>
			<c:forEach items="${books }" var="book" varStatus="vs" >
				<tr>	
					<td>${vs.index }</td>
					<td>${book.id }</td>
					<td>${book.name }</td>
					<td>${book.detail }</td>
				</tr>
			</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>