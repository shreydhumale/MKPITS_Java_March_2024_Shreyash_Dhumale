<%-- 
    Document   : c_if
    Created on : Aug 1, 2024, 3:10:57 PM
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
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  
</body>  
</html> 