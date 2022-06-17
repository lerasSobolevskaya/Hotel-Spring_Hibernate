<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Completed form</h1>
	<form:form method="post" action="registration">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name">
			</tr>
		</table>
		<table>
			<tr>
				<td>Surname:</td>
				<td><input type="text" name="surname"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Passport number:</td>
				<td><input type="text" name="passNum"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Create login:</td>
				<td><input type="text" name="login"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Create password:</td>
				<td><input type="password" name="pass"></td>
			</tr>
		</table>
			<input type="submit" class="btn large btn-success" value="Create an account">
	</form:form>
</body>
</html>