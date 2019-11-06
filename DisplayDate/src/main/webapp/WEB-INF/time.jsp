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
    <script src="js/time.js"></script>
    <link rel="stylesheet" href="css/styel.css">
    <title>Display Time</title>
</head>
<body>
    <div id="container">
        <h1 id="timeoutput"><c:out value="${time}"/></h1>
    </div>
</body>
</html>