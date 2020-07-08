<%--
  Created by IntelliJ IDEA.
  User: gautier
  Date: 08/07/2020
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connexion</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container col-6">
    <h1>Welcome <%= session.getAttribute("login")%>
    </h1>
    <h2>La connexion à été établi le <%= session.getAttribute("heure")%>
    </h2>
    <form method="post" action="disconnects">
        <button type="submit" class="btn btn-primary">Déconnexion</button>
    </form>
</div>
</body>
</html>
