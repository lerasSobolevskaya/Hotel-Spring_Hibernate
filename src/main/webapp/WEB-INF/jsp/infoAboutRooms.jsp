<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%@ taglib
	uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
<style type="text/css">
a {
	display: inline-block;
	text-decoration: none;
	text-transform: uppercase;
	letter-spacing: 1px;
	margin: 15px 25px;
	padding: 15px 20px;
	font-size: 20px;
	font-weight: bold;
	font-family: 'Montserrat', sans-serif;
	transition: 0.4s ease-in-out;
}
</style>
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
						<th>Order room</th>
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
							<td><a href="userCreateOrder/${room.id}" class="btn btn-success">${room.id}</a></td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
</body>
</html>