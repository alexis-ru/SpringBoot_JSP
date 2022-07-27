<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Welcome</h1>
<h2>${message}</h2>



<input href="${pageContext.request.contextPath}/view_for_all_employees"></input>

<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="manager" onclick="window.location.href = '/view_for_all_employees.jsp'">
</security:authorize>
</body>

</html>