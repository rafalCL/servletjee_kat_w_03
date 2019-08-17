package pl.coderslab.servletjee.servlet.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post1")
public class DisplayFirstLastNameServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        final String firstName = req.getParameter("firstName");
//        final String lastName = req.getParameter("lastName");
//
//        resp.getWriter()
//                .println("Witaj, " + firstName + " " + lastName);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String firstName = req.getParameter("firstName");
        final String lastName = req.getParameter("lastName");

        resp.getWriter()
                .println("Witaj, " + firstName + " " + lastName);
    }
}
