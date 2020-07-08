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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container col-6">
    <h1>Veuillez vous authentifier</h1>
    <h2><%= new Date() %>
    </h2>
    <p class="message"><%= session.getAttribute("message")%>
    </p>

    <form method="post" action="login">
        <div class="form-group ">
            <label for="login"> Login: </label>

            <input type="text" class="form-control" name="login" id="login" value="<%= session.getAttribute("login")%>"
                   autofocus>
            <br>
            <label for="password"> Password: </label>
            <input type="password" class="form-control" id="password" name="password"
                   value="<%= session.getAttribute("password")%>">
            <br>
            <button type="submit" class="btn btn-primary">Valider</button>
        </div>
    </form>
</div>
</body>
</html>
