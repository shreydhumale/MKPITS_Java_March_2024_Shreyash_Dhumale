<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <form action="student.jsp" method="post">
       name <input type="text" id="name" name="nm" ><br><br>
        marks<input type="number" id="marks" name="mk" ><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
