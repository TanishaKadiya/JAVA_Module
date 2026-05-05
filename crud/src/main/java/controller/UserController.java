package controller;



import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import dao.UserDAO;
import model.User;

@WebServlet("/register")
public class UserController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
System.out.println("Controller called ");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Server-side validation
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            request.setAttribute("error", "All fields are required!");
            request.getRequestDispatcher("views/register.jsp").forward(request, response);
            return;
        }

        if (!email.contains("@")) {
            request.setAttribute("error", "Invalid email format!");
            request.getRequestDispatcher("views/register.jsp").forward(request, response);
            return;
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        UserDAO dao = new UserDAO();

        if (dao.registerUser(user)) {
        	request.setAttribute("username", name);
        	request.getRequestDispatcher("Dashboard.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Registration failed!");
            request.getRequestDispatcher("ResgistrationPage.jsp").forward(request, response);
        }
    }
}