<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <c:forEach var = "cat" items"${cats}">
    <tr>
        <td>${cat.name}</td>
        <td>${cat.age}</td>
        <td><img src="${cat.picture}"> </td>
    </tr>

</table>

</body>
</html>
