<%-- 
    Document   : deposit
    Created on : Jul 29, 2024, 7:06:20 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Deposit</h1>
    <form action="banking" method="post">
        <input type="hidden" name="action" value="deposit"/>
        Email: <input type="text" name="email"/><br/>
        Amount: <input type="text" name="amount"/><br/>
        <input type="submit" value="Deposit"/>
    </form>
    </body>
</html>
