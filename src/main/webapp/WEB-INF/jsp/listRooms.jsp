<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${rooms}" var="room">

		<tr>
			<td>${room.price}</td>
			<td>${room.number}</td>
			<td>${room.numberOfSeats}</td>
			<td>${room.status}</td>
		</tr>
	</c:forEach>

</body>
</html>