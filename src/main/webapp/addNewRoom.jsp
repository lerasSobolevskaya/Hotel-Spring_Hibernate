<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h3>New room</h3>
	<form action="MainServlet" name="addRoom" method="post">
		<input type="hidden" name="action" value="addRoom">
		<table>
			<tr>
				<td>Number:</td>
				<td><input type="text" name="number">
			</tr>
		</table>
		<table>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price">
			</tr>
		</table>
		<table>
			<tr>
				<td>Number of seats:</td>
				<td><input type="text" name="number_of_seats">
			</tr>
		</table>
		<input type="submit" class="btn btn-success" value="Add room">
	</form>
</body>
</html>