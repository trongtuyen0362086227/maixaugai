<%--
  Created by IntelliJ IDEA.
  User: ntt
  Date: 10/11/2022
  Time: 7:32 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Book</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/BookServlet" method="post">
    <table border="1">
        <tr>
            <td>BookId</td>
            <td><input type="text" name="bookId"></td>
        </tr>
        <tr>
            <td>BookName</td>
            <td><input type="text" name="bookName"></td>
        </tr>
        <tr>
            <td>Bookprice</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>AuthorName</td>
            <td><input type="text" name="authorName"></td>
        </tr>
        <tr>
            <td>BookStatus</td>
            <td><input type="text" name="bookStatus"></td>
        </tr>
        <tr>
            <td colspan="4"><input type="submit" value="Create"></td>
        </tr>
    </table>
</form>
</body>
</html>
