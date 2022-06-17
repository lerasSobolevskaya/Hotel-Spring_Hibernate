<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="MainServlet" method="get">
		<input type="hidden" name="action" value="show_room"> <input
			type="submit" value="Show room" />
	</form>
</body>
</html>
<a href="authentication">register</a> 