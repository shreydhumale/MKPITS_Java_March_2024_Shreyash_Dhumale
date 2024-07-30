<%-- 
    Document   : balance
    Created on : Jul 30, 2024, 12:43:27 PM
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
          <h1>Show Balance</h1>
    <form action="banking" method="post">
        <input type="hidden" name="action" value="balance"/>
        Email: <input type="text" name="email"/><br/>
        <input type="submit" value="Show Balance"/>
    </form>
    </body>
</html>
