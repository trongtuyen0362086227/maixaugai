package ra.controller;

import ra.model.entity.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {
    private static List<Book> bookList = new ArrayList<Book>();

    @Override
    public void init() throws ServletException {
        Book b1 = new Book("B001", "Toan hoc", 25000, "Van Nhu Cuong", true);
        Book b2 = new Book("B002", "Van hoc", 15000, "Nam Cao", true);
        Book b3 = new Book("B003", "Vat ly", 35000, "NewTon", true);
        Book b4 = new Book("B004", "Hoa hoc", 45000, "Mendeleev", true);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
    }

    public void getAllBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("bookList", bookList);
        RequestDispatcher rd = request.getRequestDispatcher("views/books.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       getAllBook(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        String bookName = request.getParameter("bookName");
        float price = Float.parseFloat(request.getParameter("price"));
        String authorName = request.getParameter("authorName");
        boolean bookStatus = Boolean.parseBoolean(request.getParameter("bookStatus"));
        Book st3 = new Book(bookId,bookName,price,authorName,bookStatus);
        bookList.add(st3);
        getAllBook(request,response);
    }
}
