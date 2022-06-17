<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td></td>
			<td>Name</td>
			<td>Surname</td>
			<td>Passport number</td>
		</tr>
	</table>
	<form action="updateInfoUser" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="id" value="${user.id}"></td>
				<td><input type="text" name="name" value="${user.name}"></td>
				<td><input type="text" name="surname" value="${user.surname}"></td>
				<td><input type="text" name="passNum" value="${usser.passNum}"></td>
			</tr>
		</table>
	</form>
</body>
</html>