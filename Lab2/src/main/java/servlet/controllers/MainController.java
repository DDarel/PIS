package servlet.controllers;

import model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.codec.digest.DigestUtils;
import services.UserService;

import java.io.IOException;
import java.sql.SQLException;

public class MainController {

    static UserService userService;

    public MainController() throws SQLException, ClassNotFoundException {
    }

    public static void LogIn(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User();
        user.setEmail(email);
        user.setPassword(DigestUtils.md5Hex(password));

        try {
            if (userService.validate(user)) {
                HttpSession session = request.getSession();
                session.setAttribute("role", userService.getByEmail(email).getRoleId());
                session.setAttribute("error", "");
                response.sendRedirect("main_page_logedin.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("error", "Invalid email or password");
                response.sendRedirect("login.jsp");
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void Registration(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException {
        String name = request.getParameter("nameReg");
        String surname = request.getParameter("surnameReg");
        int roleId = 2;
        String email = request.getParameter("emailReg");
        String password = request.getParameter("passwordReg");

        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setRoleId(roleId);
        user.setEmail(email);
        user.setPassword(password);

        userService.insert(user);
        response.sendRedirect("main_page.jsp");
    }

}
