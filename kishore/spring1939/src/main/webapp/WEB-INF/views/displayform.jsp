<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<c:forEach var="p" items="${plist}">
<tr > 
<th colspan="2"><h1> welcome ${p.name} </h1></th>>
</tr>
<tr>
<td> name</td>
<td>${p.name}</td>
</tr>
<tr>
<td> last name</td>
<td>${p.lname}</td>
</tr>
<tr>
<td> contact no</td>
<td>${p.cnno}</td>
</tr>
<tr>
<td> mailid</td>
<td>${p.mailid}</td>
</tr>
<tr>
<td>date</td>
<td>${p.date}</td>
</tr>
<tr>
<td>city</td>
<td>${p.city}</td>
</tr>
</c:forEach>
</table>
<a href="/spring1939/"><button> home</button></a>
<a href="refral"><button type="button">Add new user</button></a>
</body>
</html>