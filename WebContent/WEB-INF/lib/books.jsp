<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<c:forEach items="books" var="book">
		<tr>
			<td>${book.id }</td>
			<td>${book.name }</td>
			<td>${book.detail }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>