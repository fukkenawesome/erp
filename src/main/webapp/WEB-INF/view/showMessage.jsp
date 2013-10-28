<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>${message}</h2>
		<h2>${something}</h2>
		
		
		<c:forEach var="myComplexModel" items="${complexModel}">
		  ${myComplexModel.deadline}
		</c:forEach>
		
		<c:out value="${myComplexModel.deadline}" escapeXml="true"></c:out>
	</body>
</html>
