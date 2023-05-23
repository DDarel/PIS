<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
        body {
            background: url(https://html5book.ru/wp-content/uploads/2015/07/background39.png);
        }
        .normal-text {
            right: 58%;
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
    <meta charset="ISO-8859-1">
    <title>LOGIN</title>
</head>
<body>
<style type="text/css">
    body {
        background: url(https://html5book.ru/wp-content/uploads/2015/07/background39.png);
    }
    .normal-text {
        right: 58%;
        position: center;
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
        top:30%;
        position: center;
        align-items: center;
        margin: 0 auto;
        display: block;
        font-family: 'Montserrat', sans-serif;
        font-size: 50px;
        text-transform: uppercase;
        text-align: center;
        letter-spacing: 3px;
        font-weight: 600;
        color: #524f4e;
    }
    .normal-text3 {
        top: 40%;
        left: 47%;
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
    .floating-button {
        position: fixed;
        top: 30%;
        left: 44%;
        align-items: center;
        margin: 0 auto;
        display: block;
        text-decoration: none;
        width: 140px;
        height: 45px;
        line-height: 45px;
        border-radius: 45px;
        /*margin: 10px 20px;*/
        font-family: 'Montserrat', sans-serif;
        font-size: 11px;
        text-transform: uppercase;
        text-align: center;
        letter-spacing: 3px;
        font-weight: 600;
        color: #524f4e;
        background: white;
        box-shadow: 0 8px 15px rgba(0, 0, 0, .1);
        transition: .3s;
    }
    .floating-button:hover {
        background: #2EE59D;
        box-shadow: 0 15px 20px rgba(46, 229, 157, .4);
        color: white;
        transform: translateY(-7px);
    }
</style>
<div align="center">
    <h1 class = normal-text2>Cinema Login Form</h1>
    <form action="<%=request.getContextPath()%>/registration" method="get">
        <table style="with: 100%">
            <tr>
                <td class = normal-text>Name</td>
                <td><input type="text" name="nameReg" /></td>
            </tr>
            <tr>
                <td class = normal-text>Surname</td>
                <td><input type="text" name="surnameReg" /></td>
            </tr>
            <tr>
                <td class = normal-text>Email</td>
                <td><input type="text" name="emailReg" /></td>
            </tr>
            <tr>
                <td class = normal-text>Password</td>
                <td><input type="password" name="passwordReg" /></td>
            </tr>
        </table>
        <input class = floating-button type="submit" value="Register" />
        <a href="/Lab2_war/main_page.jsp" class = normal-text3 >BACK</a>
    </form>
</div>
</body>
</html>