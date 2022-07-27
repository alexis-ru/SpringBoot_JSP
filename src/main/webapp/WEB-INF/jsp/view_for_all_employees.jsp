<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Страница входа</title>
</head>
<body>
<H3> Information for all employees</H3>
<br><br>






<security:authorize access="hasRole('MANAGER')">
<input type="button" value="manager" onclick="window.location.href = '/manager_info'">
Only for manager staff
</security:authorize>
<br><br>

<security:authorize access="hasRole('SECUSER')">
<input type="button" value="secuser" onclick="window.location.href = '/secuser_info'">
Only for security employee
</security:authorize>

</body>
</html>
