<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="index.jsp" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<br/>
<form action="login.jsp" method="post">
    Email:<input type="text" name="email"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
</form>

<%
    if (request.getParameter("email") != null && request.getParameter("password") != null){
        if (request.getParameter("email").equals("admin") && request.getParameter("password").equals("password")){
            response.sendRedirect(("profile.jsp"));
        }
    }
%>



</body>
</html>
