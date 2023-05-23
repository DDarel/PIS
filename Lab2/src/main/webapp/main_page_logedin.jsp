<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style type="text/css">
    body {
        background: url(https://html5book.ru/wp-content/uploads/2015/07/background39.png);
    }
    .floating-button {
        position: fixed;
        top: 30%;
        left: 45%;
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
    .floating-button1 {
        position: fixed;
        top: 40%;
        left: 45%;
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
    .floating-button1:hover {
        background: #2EE59D;
        box-shadow: 0 15px 20px rgba(46, 229, 157, .4);
        color: white;
        transform: translateY(-7px);
    }
    .floating-button2 {
        position: fixed;
        top: 50%;
        left: 45%;
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
    .floating-button2:hover {
        background: #2EE59D;
        box-shadow: 0 15px 20px rgba(46, 229, 157, .4);
        color: white;
        transform: translateY(-7px);
    }
</style>

    <a href="/Lab2_war/user_menu.jsp" class="floating-button">Seances</a>

    <a href="/Lab2_war/main_page.jsp"
<%--       <%--%>
<%--           session.removeAttribute("password");--%>
<%--           session.removeAttribute("login");--%>
<%--           session.removeAttribute("role");--%>
<%--       %>--%>
       class="floating-button2">logout
    </a>

</body>
</html>
