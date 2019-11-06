<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <title>The Code</title>
</head>
<body>
    <h2><c:out value="${error}"/></h2>
    <h2>What is the code ?</h2>
    <form method="post" action="/code">
        <input type="text" name="code">
        <button type="submit">Try Code</button>
    </form>
</body>
</html>