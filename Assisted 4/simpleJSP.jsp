<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple JSP Project</title>
</head>
<body>
<h2> Hi Users....</h2>
<%out.print("total number of visitors= "); %>
<%!
int counter=0;
int getUsers(){
	return ++counter;
}
%>

<%=getUsers()%>
</body>
</html>
