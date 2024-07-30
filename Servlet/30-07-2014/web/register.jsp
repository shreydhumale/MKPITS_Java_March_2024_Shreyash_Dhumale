<%-- 
    Document   : register
    Created on : Jul 30, 2024, 11:07:49 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register</h1>
    <form action="banking" method="post">
        <input type="hidden" name="action" value="register"/>
        Name: <input type="text" name="name"/><br/>
        Email: <input type="text" name="email"/><br/>
        Password: <input type="password" name="password"/><br/>
        <input type="submit" value="Register"/>
    </form>
    </body>
</html>
