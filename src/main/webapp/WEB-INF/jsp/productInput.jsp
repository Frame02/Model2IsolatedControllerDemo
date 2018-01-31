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
    <title>Product Input</title>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
</head>
<body>
<h1>Product Input Form:</h1>
<form action="/product_save.do" method="post">
    <fieldset>
        <legend>Product Input Form</legend>
        <p>
            <label for="name">Name:</label>
            <input type="text" name="name" id="name" tabindex="1">
        </p>
        <p>
            <label for="description">Description:</label>
            <input type="text" name="description" id="description" tabindex="2">
        </p>
        <p>
            <label for="price">Price:</label>
            <input type="text" name="price" id="price" tabindex="3">
        </p>
        <p>
            <input type="reset" value="Reset" tabindex="4">
            <input type="submit" value="Submit" tabindex="5">
        </p>
    </fieldset>
</form>

</body>
</html>
