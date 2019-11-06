<%--
  Created by IntelliJ IDEA.
  User: ${USER}
  Date: ${DATE}
  Time: ${TIME}
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/date.js"></script>
    <link rel="stylesheet" href="css/styel.css">
    <title>Display Date</title>
</head>
<body>
    <div id="container">
        <h1 id="dateoutput"><c:out value="${date}"/></h1>
    </div>
<c:out value="${date}"/>
</body>
</html>