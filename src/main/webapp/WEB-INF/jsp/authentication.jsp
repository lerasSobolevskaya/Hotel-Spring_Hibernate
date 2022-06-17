<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
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
	<div class="container">
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Price</th>
					<th>Number</th>
					<th>Number of seats</th>
					<th>Status</th>
					<th>Type</th>
				</tr>
			</thead>
			<c:forEach var="room" items="${roomList}">
				<tbody>
					<tr>
						<td>${room.price}</td>
						<td>${room.number}</td>
						<td>${room.numberOfSeats}</td>
						<td>${room.status}</td>
						<td>${room.types}</td>
					</tr>
				</tbody>
			</c:forEach>

		</table>
	</div>
	<form action="authentication" method="post">

		<div class="form-group">
			<label class="col-md-4 control-label" for="Login">Login</label>
			<div class="col-md-4">
				<input id="Login" name="login" type="text"
					pattern="[A-Za-z0-9]{6-12}" placeholder="put your login here"
					class="form-control input-md" required>
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-4 control-label" for="Password">Password</label>
			<div class="col-md-4">
				<input id="Password" name="pass" type="password"
					placeholder="put your password here" pattern="[A-Za-z0-9]{6-12}"
					class="form-control input-md" required> 
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-4 control-label" for="singlebutton"></label>
			<div class="col-md-4">
				<button id="singlebutton" name="singlebutton"
					class="btn btn-outline-primary">Login</button>
			</div>
		</div>
	</form>
</body>
</html>