<%-- 
    Document   : withdraw.jsp
    Created on : Jul 29, 2024, 7:07:10 PM
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
         <h1>Withdraw</h1>
    <form action="banking" method="post">
        <input type="hidden" name="action" value="withdraw"/>
        Email: <input type="text" name="email"/><br/>
        Amount: <input type="text" name="amount"/><br/>
        <input type="submit" value="Withdraw"/>
    </form>
    </body>
</html>
