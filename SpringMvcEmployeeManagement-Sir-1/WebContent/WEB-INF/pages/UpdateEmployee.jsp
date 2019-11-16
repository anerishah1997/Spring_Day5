<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h2>Welcome to Employee Management System</h2>
	<h3>Add Employee Details Here</h3>
	<form action="updateEmployee.do" method="post">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="employeeId" value="${ param.employeeId }"></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="employeeName" value="${ param.employeeName }"></td>
			</tr>
			 <tr>
				<td>Employee Salary</td>
				<td><input type="text" name="employeeSalary" value="${ param.employeeSalary }"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Employee"></td>
			</tr>
		</table>
	</form>
</body>
</html>