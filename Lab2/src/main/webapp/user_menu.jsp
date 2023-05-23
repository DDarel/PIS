<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Local Cinema</title>
</head>
<body>
<style type="text/css">
    body {
        background: url(https://html5book.ru/wp-content/uploads/2015/07/background39.png);
    }
    .normal-text {
        top: 20%;
        left: 35%;
        position: fixed;
        align-items: center;
        margin: 0 auto;
        display: block;
        font-family: 'Montserrat', sans-serif;
        font-size: 20px;
        text-transform: uppercase;
        text-align: center;
        letter-spacing: 3px;
        font-weight: 600;
        color: #524f4e;
    }
    .normal-text2 {
        top: 40%;
        left: 45%;
        position: fixed;
        align-items: center;
        margin: 0 auto;
        display: block;
        font-family: 'Montserrat', sans-serif;
        font-size: 20px;
        text-transform: uppercase;
        text-align: center;
        letter-spacing: 3px;
        font-weight: 600;
        color: #524f4e;
    }
</style>
<h1 class = normal-text>Welcome to our cinema</h1>
<c:out value="${role} - role"></c:out>
<c:choose>
    <c:when test="${role == 1}">
        <a href="/Lab2_war/main_page_logedin.jsp" class = normal-text2 >BACK</a>
    </c:when>
    <c:when test="${role == 2}">
        <a href="/Lab2_war/main_page_logedin.jsp" class = normal-text2 >BACK</a>
    </c:when>
    <c:otherwise>
        <a href="/Lab2_war/main_page.jsp" class = normal-text2 >BACK</a>
    </c:otherwise>
</c:choose>

<br>

</body>
</html>
