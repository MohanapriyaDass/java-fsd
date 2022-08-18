<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String brand = request.getParameter("brand");
	String quantity = request.getParameter("quantity");
	%>



	<jsp:forward page="success.jsp">
		<jsp:param value="<%=name%>" name="uname" />
	</jsp:forward>



</body>
</html>

