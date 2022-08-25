<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--<c:out> printing the value over the page--%>
<%-- 
<c:out value="${101}"></c:out>
<c:out value="${'hi how are u'}"></c:out>
--%>

<%--declare and print --%>
<%--
<c:set var="a" value="${101}"></c:set>
<c:out value="${a}"></c:out> --%>


<%--remove --%>
 <%--
<c:set var="a" value="${101}"></c:set>
<p>before value is </p>
<c:out value="${a+10}"></c:out>
<p>after value is </p>
<c:remove var="a"/>
<c:out value="${a+10}"></c:out>
 --%>

<%--if iff the condition is always set to true--%>
<%-- 
<c:set var="a" value="${101}"></c:set>
<c:set var="b" value="${10}"></c:set>
<c:if test="${a>b}">
<c:out value="${'value of a is greater' }"></c:out>
</c:if>  
--%>

<%--choose when otherwise --%>
 
<c:set var="a" value="${0}"></c:set>
<c:choose>
<c:when test="${a>=100}">

the value of a is greater
</c:when>
<c:when test="${a>=0 && a<100 }">
the value is between 0 and 99

</c:when>
<c:otherwise>
the value of input is wrong
</c:otherwise>
</c:choose>


</body>
</html>
