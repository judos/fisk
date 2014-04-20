<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%@ page import="view.tests.Test1" language="java"%>

<jsp:useBean id="Test1" class="view.tests.Test1" scope="session"/>


<html>
<head>
<title>FISK</title>
</head>
<body>
<h1 align="center">FISK</h1>
<ul>
  
  <li>
    <a href="servlet/MyHelloWorldServlet">servlet/MyHelloWorldServlet</a> - Servlet Hello World Example
  </li>
  
  <%= Test1.doGet() %>
  
</ul>
</body>
</html>