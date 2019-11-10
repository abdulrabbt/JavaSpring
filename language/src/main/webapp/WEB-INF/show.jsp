<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="/languages">Dashboard</a>
<h1><c:out value="${language.name}"/></h1>
<p>Creator: <c:out value="${language.creator}"/></p>
<p>Version: <c:out value="${language.currentVersion}"/></p>

<a href="/languages/${language.id}/edit">Edit</a>
<%-- <form action="/languages/${language.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form> --%>
<a href="/languages/${language.id}/remove"> Delete</a>