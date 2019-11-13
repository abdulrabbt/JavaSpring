<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Dojo Ninjas</title>
    <link rel="stylesheet" href="/main.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
    <div id="container">

    <h1>Dojo Ninjas</h1>
    <a href="/dojos/new">Create Dojo</a> | <a href="/ninjas/new">Create Ninja</a>
    <table class="table table-striped table-dark table-hover ">
        <thead>
        <tr>
            <th scope="col">Dojo Name</th>
            <th scope="col">Ninja Count</th>
            <th scope="col">Date Created</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${dojos}" var="dojo">
            <tr>
                <td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
                <td><c:out value="${dojo.getNinjas().size()}"/> ninjas</td>
                <td><c:out value="${dojo.createdAt}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>