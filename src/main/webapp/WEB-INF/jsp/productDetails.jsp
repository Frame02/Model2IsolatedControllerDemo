<%--
  Created by IntelliJ IDEA.
  User: vedantas
  Date: 1/31/2018
  Time: 1:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Saved Prdocut Details</title>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
</head>
<body>
<h1>Saved Product Details:</h1>
<table>
    <thead>
    <tr>
        <th>Description</th>
        <th>Value</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Name:</td>
        <td>${product.name}</td>
    </tr>
    <tr>
        <td>Description:</td>
        <td>${product.description}</td>
    </tr>
    <tr>
        <td>Price:</td>
        <td>${product.price}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
