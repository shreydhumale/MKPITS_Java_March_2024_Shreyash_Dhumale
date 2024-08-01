<%-- 
    Document   : c_import
    Created on : Aug 1, 2024, 3:05:13 PM
    Author     : ASUS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body>  
<c:import var="data" url="http://www.javatpoint.com"/>  
<c:out value="${data}"/>  
</body>  
</html>  
