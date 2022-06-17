<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
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
	<a href="/LastHotel/order/" class="btn large btn-success">Order room</a>
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
</body>
</html>