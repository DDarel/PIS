package servlet;

import servlet.controllers.MainController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/")
public class MainServlet extends HttpServlet{

    public void init() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            MainController.LogIn(request, response);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            MainController.Registration(req, resp);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        final HttpSession session = req.getSession();
    }
}
