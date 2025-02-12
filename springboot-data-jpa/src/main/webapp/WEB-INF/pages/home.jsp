<%@taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Management System</h1>
	<table border="1" width="100%">
		<c:forEach items="${emps}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.address}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>