package pl.coderslab.servletjee.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session1Get")
public class Session1GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final HttpSession session = req.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        if(counter!=null) {
            resp.getWriter().println("Counter: " + counter);
            session.setAttribute("counter", counter + 1);
        } else {
            resp.getWriter().println("Brak atrybutu counter");
        }
    }
}
