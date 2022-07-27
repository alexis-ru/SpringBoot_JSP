<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title for Client Manager</title>
</head>
<body>
<H3>Here you can see all transaction</H3>
<div>
<table border="1">
    <tr>
        <th>ИНН</th>
        <th>КПП</th>
        <th>ОГРН</th>
        <th>ОПФ</th>
        <th>Наименование</th>
        <th>Деньги</th>
        <th>Дата</th>
        <th>Операции</th>
    </tr>

    <c:forEach var="cls" items="${allclients}">

        <c:url var="updateButton" value="http://127.0.0.1:8080/updateinfo">
            <c:param name="clsId" value="${cls.id}"></c:param>
        </c:url>

        <c:url var="deleteButton" value="http://127.0.0.1:8080/deleteclient">
            <c:param name="clsId" value="${cls.id}"></c:param>
        </c:url>

        <tr>
            <td>${cls.inn}</td>
            <td>${cls.kpp}</td>
            <td>${cls.ogrn}</td>
            <td>${cls.opf}</td>
            <td>${cls.name}</td>
            <td>${cls.money}</td>
            <td>${cls.date_pay}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href=${updateButton}"/>
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>


</table>
</div>
<%--/src/main/webapp/WEB-INF/jsp/view_for_all_employees--%>
<br>
<div>
<h2> Цветы </h2>

<table border="1">
    <tr>
        <th>Наименование</th>
        <th>Тип</th>
        <th>Дата продажи</th>
        <th>Дата покупки</th>
    </tr>

    <%--@elvariable id="flower" type="com.mts.boot.jsp.api.entity.Flower"--%>
    <c:forEach var="flowerы" items="${allflow}">
        <tr>
            <td>${flower.name}</td>
            <td>${flower.type}</td>
            <td>${flower.sel_price}</td>
            <td>${flower.purch_price}</td>
        </tr>
    </c:forEach>
</table>
</div>
<br>
<br>
<input type="button" value="Назад" onclick="window.location.href='http://127.0.0.1:8080/'"/>
<br>
</body>
</html>
