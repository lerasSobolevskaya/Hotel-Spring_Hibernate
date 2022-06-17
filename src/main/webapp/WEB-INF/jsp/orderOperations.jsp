<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
	<table class="table table-dark">
		<thead>
			<tr>
				<th>Order</th>
				<th>User</th>
				<th>Room</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>Remove</th>
			</tr>
		</thead>
		<c:forEach var="order" items="${listOrders}">
			<tbody>
				<tr>
					<td><a href="getOrder/${order.id}" class="btn btn-success">${order.id}</a></td>
					<td>${order.user}</td>
					<td>${order.room}</td>
					<td>${order.startDate}</td>
					<td>${order.endDate}</td>
					<td><a href="<c:url value='delete/${order.id}'/>"
						class="btn btn-success">Delete</a></td>
					<td><a href="/LastHotel/crudOrders/updateOrder/${order.id}" class="btn btn-success">Update</a></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	<a href="createOrder" class="btn btn-success"> Add new order</a>
</body>
</html>