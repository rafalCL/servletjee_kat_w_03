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
    <title>jsp1</title>
</head>
<body>
    <p>static text</p>
    <p><c:out value="${role}" default="guest" /></p>
</body>
</html>
