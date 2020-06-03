<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/06/2020
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>YEAR</td>
        <td>ADDRESS</td>
    </tr>
   <@% <c:forEach items="${customer}" var="customer"></c:forEach> %>
    <tr>
        <td>
         <@%  <c:out value="${customer.getName()}"></c:out> %>
        </td>
    </tr>
</table>
</body>
</html>
