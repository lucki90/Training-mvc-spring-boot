<%--
  Created by IntelliJ IDEA.
  User: Tomek
  Date: 2019-06-25
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Boot </title>
</head>
<body>

<h1>Spring Caculator</h1>
<form method="post">
    <input name="valueA" type="number" /> <br />
    <input name="valueB" type="number" /> <br />
    <input value="Add" type="submit" />
</form>
<br>
<h1>Shopping Cart</h1>
<form action="add" method="post">
    <input name="product" /><br/>
    <input value="Add Product" type="submit" />
</form>
<a href="print">Print Products in console</a>
</body>
</html>

