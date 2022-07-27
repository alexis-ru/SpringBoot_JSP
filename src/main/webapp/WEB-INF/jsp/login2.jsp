<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
</head>

<body>

<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>

<p style="color: red;">${errorString}</p>
<sec:authorize access="isAuthenticated()">
    <% response.sendRedirect("/"); %>
</sec:authorize>





<div>
    <form method="POST" action="/login">
        <h2>Вход в систему</h2>
        <div>
            <input name="username" type="text" placeholder="Username"
                   autofocus="true"/>
            <input name="password" type="password" placeholder="Password"/>
            <button type="submit">Log In</button>
        </div>
    </form>
</div>


















</body>
</html>
