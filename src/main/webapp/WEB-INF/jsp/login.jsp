<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<%--<c:if test="${not empty param.language}">--%>
<%--    <c:set var="language" value="${param.language}" scope="session"/>--%>
<%--</c:if>--%>
<%--<fmt:setLocale value="${language}" />--%>
<fmt:setBundle basename="com.mts.boot.jsp.api.entity.Client" />
<!DOCTYPE html>
<html>
<head>
<%--    <meta charset="UTF-8">--%>
    <title>fmt:bundle example</title>
</head>
<body>
<h2>Вход в систему</h2>
<form action="">
    <table border="0">
        <tr>
            <td>
                <fmt:message key="login.label.userName"/>
            </td>
            <td>
                <a type="text">Логин</a>
                <input type="text" name="userName" placeholder="Введите логин"/>
            </td>
        </tr>
        <tr>
            <td>
                <fmt:message key="login.label.password"/>
            </td>
            <td>
                <a type="text">Пароль</a>
                <input type="password" name="userPassword" placeholder="Введите пароль"/></td>
        </tr>
    </table>
    <input type="submit"  value="Submit"/>
</form>
</body>
</html>