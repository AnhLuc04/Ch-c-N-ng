package Mangger;

import codegym.CustomerList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.Deflater;

@WebServlet(name = "ManggerServlet", urlPatterns = "/customer")
public class ManggerServlet extends HttpServlet {
    private CustomerList customerList = new CustomerList().getInstance();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String enter = request.getParameter("Enter");
        doEnter(enter, request, response);
    }

    private void doEnter(String enter, HttpServletRequest request, HttpServletResponse response) {
        if (enter == null) {
            enter = "";
        }
        try {
            switch (enter) {
                case "list":
                    getlist(request, response);
                    break;
                default:
                    PrintWriter writer = response.getWriter();
                    writer.print("Cung cap action truoc khi thuc hien");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getlist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customer", customerList.getList());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
