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
</head>
<body>
<h1>Welcome <%= session.getAttribute("login")%></h1>
<h2>La connexion à été établi le <%= session.getAttribute("heure")%> </h2>
<form method="post" action="disconnects">
<input type="submit" value="Déconnexion">
</form>

</body>
</html>
