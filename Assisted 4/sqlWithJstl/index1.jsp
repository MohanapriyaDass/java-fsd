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
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db4" user="root" password="PriyA2016@gpd"/>
<sql:query  dataSource="${db}"  var="rs">
select * from employee1;
</sql:query>

<table border="1">
<tr><th>empno</th><th>empname</th></tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.eid}</td><td>${table.ename}</td></tr>
</c:forEach>
</table>

</body>
</html>
