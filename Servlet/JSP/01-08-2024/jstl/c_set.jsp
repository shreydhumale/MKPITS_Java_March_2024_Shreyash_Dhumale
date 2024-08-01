<%-- 
    Document   : c_set
    Created on : Aug 1, 2024, 3:07:42 PM
    Author     : ASUS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="Income" scope="session" value="${4000*4}"/>  
<c:out value="${Income}"/>  
</body>  
</html>
