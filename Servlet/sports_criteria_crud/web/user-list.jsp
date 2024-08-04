<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.model.User" %>

<html>
<head>
    <title>User List</title>
        <link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>
    <h2>List of Players</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>City</th>
            <th>Age</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listPlayers}">
    <tr>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.city}</td>
        <td>${user.age}</td>
        <td>
            <a href="PlayerServlet?action=edit&email=${user.email}">Edit</a>
            <a href="PlayerServlet?action=delete&email=${user.email}">Delete</a>
            
        </td>
    </tr>
</c:forEach>

    </table>
            <a href="PlayerServlet?action=new">New Player</a>
</body>
</html>


