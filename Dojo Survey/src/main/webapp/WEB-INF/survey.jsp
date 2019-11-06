<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <title>Dojo Survey</title>
</head>
<body>
    <h1>SubmittedInfo</h1>
    <h2>Name: </h2> <p><c:out value="${surveyList[0]}"/></p>
    <h2>Dojo Location:</h2> <p><c:out value="${surveyList[1]}"/></p>
    <h2>FavoriteLanguage:</h2> <p><c:out value="${surveyList[2]}"/></p>
    <h2>Comment: </h2> <p><c:out value="${surveyList[3]}"/></p>
</body>
</html>