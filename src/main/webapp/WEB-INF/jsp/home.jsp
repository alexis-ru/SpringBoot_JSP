<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Expression Language Demo</title>
</head>
<body>

<div class="container">

    <div class="starter-template">
        <h1>Вход для сотрудников цветочного магазина "Незабудка"</h1>
        <br>
        <h2>1. <a th:href="@{/admin}">Вход для директора</a></h2>
        <br>
        <h2>2. <a th:href="@{/user}">Вход для сотрудника</a></h2>
    </div>

</div>

</body>
</html>