<%-- 
    Document   : withdraw
    Created on : Jul 30, 2024, 12:42:26 PM
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
           <h2>Withdraw</h2>
    <form action="banking" method="post">
        <input type="hidden" name="action" value="withdraw"/>
        Email: <input type="text" name="email"/><br/>
        Amount: <input type="text" name="amount"/><br/>
        <input type="submit" value="Withdraw"/>
    </form>
    </body>
</html>
