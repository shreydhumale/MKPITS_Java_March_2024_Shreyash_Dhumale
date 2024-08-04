<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.model.User" %>

<%
    User user = (User) request.getAttribute("user");
    if (user == null) {
        user = new User();
    }
    String action = (user.getEmail() == null) ? "insert" : "update";
%>

<html>
<head>
    <title>Player Form</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h2><c:out value="${user.email == null ? 'New Player' : 'Edit Player'}" /></h2>

    <c:if test="${not empty errorMessage}">
        <div class="error">
            <c:out value="${errorMessage}" />
        </div>
    </c:if>

    <form action="PlayerServlet?action=${action}" method="post">
        Name: <input type="text" name="name" value="${user.name}" required /><br/>
        Email: <input type="email" name="email" value="${user.email}" ${user.email != null ? 'readonly' : ''} required /><br/>
        City: <input type="text" name="city" value="${user.city}" required /><br/>
        Age: <input type="number" name="age" value="${user.age}" required /><br/>
        <input type="submit" value="${user.email == null ? 'Insert' : 'Update'}" />
    </form>
</body>
</html>
