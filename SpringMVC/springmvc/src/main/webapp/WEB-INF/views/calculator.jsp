<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>

<body>
    <h2>Calculator for 2 Numbers</h2>
    <form>
        <h3>Enter Numbers</h3>
        <input type="number" name="t1" required>
        <input type="number" name="t2" required>
        <br><br>
        <button type="submit" formaction="${pageContext.request.contextPath}/add">Add</button>
        <button type="submit" formaction="${pageContext.request.contextPath}/sub">Subtract</button>
        <button type="submit" formaction="${pageContext.request.contextPath}/mul">Multiply</button>
        <button type="submit" formaction="${pageContext.request.contextPath}/div">Divide</button>
    </form>
    <h2>Result is: <%= request.getAttribute("result") %></h2>
</body>
</html>