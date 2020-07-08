<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: gautier
  Date: 08/07/2020
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h1>Veuillez vous authentifier</h1>
<h2><%= new Date() %>
</h2>

<form method="post" action="login">
    <label for="login"> Login: </label>
    <input type="text" name="login" id="login" value="<%= session.getAttribute("login")%>" autofocus>
    <br>
    <label for="password"> Password: </label>
    <input type="password" id="password" name="password" value="<%= session.getAttribute("password")%>">
    <input type="submit" value="Valider" >
</form>



</body>
</html>
