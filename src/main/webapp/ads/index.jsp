<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<%@ include file="/partials/navbar.jsp" %>

<h1>Here are the Ads</h1>
<br>
<c:forEach var="ad" items="${ads}">
    <div class="col-md-6">
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>

<%@ include file="/partials/bootstrap.jsp" %>
</body>
</html>