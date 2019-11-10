<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Edit Language</h1>


<form:form action="/languages/${language.id}/edit" method="post" modelAttribute="language">

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