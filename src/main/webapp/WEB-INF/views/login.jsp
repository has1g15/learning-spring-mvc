<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: hashort
  Date: 16/06/2019
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%--<%--%>
    <%--System.out.println(request.getParameter("name"));--%>
    <%--Date date = new Date();--%>
<%--%>--%>
<%--<div>Current date is <%=date%></div>--%>
<%--My name is ${name}, my password is ${password}--%>
<p><font color="red">${errorMessage}</font></p>
<form action="/login" method="post">
    Name: <input type="text" name="name"/>
    Password: <input type="password" name="password"/>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
