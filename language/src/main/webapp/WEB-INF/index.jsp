<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.example.language.models.Language" %>


<h1>All Languages</h1>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Creator</th>
        <th>Version</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${languages}" var="language">
        <tr>
            <td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.currentVersion}"/></td>
            <td>
                <a href="/languages/${language.id}/edit">Edit</a>
                <a href="/languages/${language.id}/remove"> Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h1>New Language</h1>


<form:form method="POST" action="/languages" modelAttribute="language">

    <form:label path="name">Language Name:
        <form:errors path="name"/><br>
        <form:input type = "text" path="name"/></form:label><br>

    <form:label path="creator">Creator:
        <form:errors path="creator"/><br>
        <form:input type="text" path="creator"/></form:label><br>

    <form:label path="currentVersion">Version:
        <form:errors path="currentVersion"/><br>
        <form:input type="text" path="currentVersion"/></form:label><br>

    <button type=submit>Submit</button>
</form:form>