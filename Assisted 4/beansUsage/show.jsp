<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
          <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userid" class="com.example.Detail"></jsp:useBean>
<jsp:setProperty property="*" name="userid"/>
properties of user are
<jsp:getProperty property="user" name="userid"/><br>
<jsp:getProperty property="password" name="userid"/><br>
<jsp:getProperty property="age" name="userid"/><br>

</body>
</html>
