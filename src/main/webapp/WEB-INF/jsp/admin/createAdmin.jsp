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
</head>
<body>
	<h1>Add new Room</h1>
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

		<div class=col-md-2>
			<p>types:</p>
			<form:select path="types" multiple="true" size="5" required="true">
				<form:option disabled="true" value="choose type" />
				<c:forEach items="${typeList}" var="type">
					<option value="${type.id}"
						${room.types.contains(type)?"selected":""}>${type.type}</option>
				</c:forEach>
			</form:select>
		</div>
		<input type="submit" class="btn btn-success" value="Add room">
	</form:form>
</body>
</html>