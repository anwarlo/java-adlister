<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Hello</title>
    <%@ include file="/partials/head.jsp" %></head>
<body>
<%@ include file="/partials/navbar.jsp" %>
<h1> The current count is ${count}.</h1>

<h2>Hello, ${name}!</h2>
</body>
</html>
