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
    <form action="/survey" method="post">
        <label>Your Name: <input type="text" name="name"></label>
        <br>
        <label>Dojo Location:
            <select name="location">
                <option value="Riyadh">Riyadh</option>
                <option value="Jeddah">Jeddah</option>
                <option value="Makkah">Makkah</option>
            </select>
        </label>
        <br>
        <label>Favorite Language:
            <select name="language">
                <option value="Java">Java</option>
                <option value="Python">Python</option>
                <option value="Javascript">Javascript</option>
            </select>
        </label>
        <br>
        <label>Comment (optional): <textarea rows="6" cols="50" name="comment"></textarea></label>
        <button type="submit">Submit</button>
    </form>
</body>
</html>