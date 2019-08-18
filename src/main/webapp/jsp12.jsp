<%--
  Created by IntelliJ IDEA.
  User: Edu
  Date: 18.08.2019
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>jsp12</title>
</head>
<body>
    <p>static text</p>
    <div>
        <c:choose>
            <c:when test="${empty start or empty end}">
                <p>brak danych</p>
            </c:when>
            <c:otherwise>
            <ul>
            <c:forEach begin="${start}" end="${end}" var="i">
                <li><c:out value="${i}" /></li>
            </c:forEach>
            </ul>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>
