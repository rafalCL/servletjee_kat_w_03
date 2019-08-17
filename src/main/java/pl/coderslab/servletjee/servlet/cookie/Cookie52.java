package pl.coderslab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Cookie[] cookies = req.getCookies();
        boolean found = false;

        try {
            for (Cookie c : cookies) {
                if ("cookie51".equals(c.getName())) {
                    resp.getWriter().println("Witaj na stronie cookie52");
                    c.setMaxAge(0);
                    resp.addCookie(c);
                    found = true;
                    break;
                }
            }
        } catch (Exception e) {
        }

        if (!found) {
            resp.sendRedirect("/cookie51");
        }
    }
}
