<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is a JSP Page</title>
</head>
<body>
	<%="This is a JSP page."%>

	<c:set var="menuItems" value="${requestScope.menuItems}" />

	<c:if test="${not empty menuItems}">
		<ul>
			<c:forEach items="${menuItems}" var="menuItem">
				<li><a href="${menuItem.url}">${menuItem.label}</a></li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>