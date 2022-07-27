<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление нового сотрудника</title>
</head>
<body>
<h2>Добавление нового сотрудника </h2>
<br><br>
<%--@elvariable id="client" type="com.mts.boot.jsp.api.entity.Client"--%>
<form:form action="saveclient" modelAttribute="client">
    <form:hidden path="id"/>
    Имя <form:input path="inn" />
    <br><br>
    Фамилия <form:input path="kpp" />
    <br><br>
    Департамент <form:input path="ogrn" />
    <br><br>
    Зарплата <form:input path="opf" />
    <br><br>
    Зарплата2 <form:input path="name" />
    <br><br>
    Зарплата3 <form:input path="money" />
    <br><br>
    Зарплата4 <form:input path="date_pay" />
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
