<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta charset="UTF-8">
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
	<h3>Update room</h3>
	<form:form method="post" action="saveRoom">
		<table>
			<tr>
				<td><form:input type="hidden" path="id" name="id" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Number:</td>
				<td><input type="text" name="number" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Number of seats:</td>
				<td><input type="text" name="numberOfSeats" /></td>
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
		<table>
			<tr>
				<td>Status:</td>
				<td><input type="text" name="status" /></td>
			</tr>
		</table>
		<input type="submit" class="btn btn-success" value="Update room">
	</form:form>
</body>
</html>