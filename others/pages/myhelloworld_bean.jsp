<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%@ page import="myeclipse.MyHelloWorldBean" language="java"%>

<jsp:useBean id="MyHelloWorld" class="myeclipse.MyHelloWorldBean" scope="session"/>


<html>
<head>
<title>Hello World (JSP & Java Bean Example)</title>
</head>
<body>
<h1 align="center">Hello World (JSP & Java Bean Example)</h1>
  Bean Example MyHelloWorld.getStrMyMessage(): <%= MyHelloWorld.getStrMyMessage() %>
</body>
</html>
