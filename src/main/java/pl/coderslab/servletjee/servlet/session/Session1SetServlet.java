package pl.coderslab.servletjee.servlet.session;

import pl.coderslab.servletjee.servlet.post.Censor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session1Set")
public class Session1SetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final HttpSession session = req.getSession();
        session.setAttribute("counter", 0);
        resp.getWriter().println("Dodano atrybut");
    }
}
