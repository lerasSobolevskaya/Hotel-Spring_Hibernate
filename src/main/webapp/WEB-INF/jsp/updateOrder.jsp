<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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

	<h3>Update order</h3>
	<form:form method="post" action="updateOrderSave">
		<table>
			<tr>
				<td><form:input type="hidden" path="id" name="id" /></td>
			</tr>
		</table>

		<table>
			<tr>
				<td>Start date:</td>
				<td><input type="date" name="startDate" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<td>End date:</td>
				<td><input type="date" name="endDate" /></td>
			</tr>
		</table>
		<input type="submit" class="btn btn-success" value="Update order">
	</form:form>
</body>
</html>