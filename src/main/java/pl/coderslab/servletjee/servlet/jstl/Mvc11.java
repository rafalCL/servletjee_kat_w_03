package pl.coderslab.servletjee.servlet.jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String roleStr = req.getParameter("role");
        req.setAttribute("role", roleStr);

        getServletContext().getRequestDispatcher("/jsp1.jsp")
                .forward(req, resp);
    }
}
