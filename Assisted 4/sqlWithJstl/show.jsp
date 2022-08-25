<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db4" user="root" password="PriyA2016@gpd"/>

<sql:update dataSource="${db}" var="rows">
insert into employee1 values(?,?);
<sql:param value="${param.no}"></sql:param>
<sql:param value="${param.name}"></sql:param>
</sql:update>
<c:if test="${rows>0}">
insertion is successful
</c:if>

<form action="index1.jsp">
<input type="submit"> 
</form>

</body>
</html>
