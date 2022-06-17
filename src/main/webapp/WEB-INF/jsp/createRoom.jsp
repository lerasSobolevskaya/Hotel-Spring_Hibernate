<!DOCTYPE>
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
	<form:form action="create" method="post">
		<table>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Number:</td>
				<td><input type="text" name="number"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Number of seats:</td>
				<td><input type="text" name="numberOfSeats"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Status:</td>
				<td><input type="text" name="status"></td>
			</tr>
		</table>
				<table>
					<tr>
						<td>Type:</td>
						<td><form:select path="types" multiple="true">
								<c:forEach items="${listType}" var="type">
									<option value="${type.id}">${type.type}</option>
								</c:forEach>
							</form:select></td>
					</tr>
				</table>
		<input type="submit" class="btn btn-success" value="Add room">
	</form:form>

</body>
</html>