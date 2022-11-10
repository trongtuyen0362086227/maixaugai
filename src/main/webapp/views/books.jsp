<%--
  Created by IntelliJ IDEA.
  User: ntt
  Date: 09/11/2022
  Time: 11:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Book</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>BookId</th>
        <th>BookName</th>
        <th>Price</th>
        <th>Author</th>
        <th>BookStatus</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
     <c:forEach items="${bookList}" var="book">
         <tr>
             <td>${book.bookId}</td>
             <td>${book.bookName}</td>
             <td>${book.price}</td>
             <td>${book.authorName}</td>
             <td>${book.bookStatus}</td>
             <td>
                 <a href="">Update</a>
                 <a href="">Delete</a>
             </td>
         </tr>
     </c:forEach>
    </tbody>
</table>
<a href="views/newBook.jsp">Create new Book</a>
</body>
</html>
