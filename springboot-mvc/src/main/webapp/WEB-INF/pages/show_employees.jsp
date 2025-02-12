<%@page import="com.flm.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Management System</h1>
	<p />
	<table border="1" width="100%">
		<%
		List<Employee> emps = (List<Employee>) request.getAttribute("emps");
		for (Employee emp : emps) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getAddress()%></td>
			<td><%=emp.getSalary()%></td>
		</tr>

		<%
		}
		%>
	</table>
</body>
</html>