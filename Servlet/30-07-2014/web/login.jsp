<%-- 
    Document   : login
    Created on : Jul 30, 2024, 11:09:33 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In</title>
    </head>
    <body>
         <h2>Login</h2>
    <form action="banking" method="post">
        <input type="hidden" name="action" value="login"/>
        Email: <input type="text" name="email"/><br/>
        Password: <input type="password" name="password"/><br/>
        <input type="submit" value="Login"/>
    </form>
    </body>
</html>
