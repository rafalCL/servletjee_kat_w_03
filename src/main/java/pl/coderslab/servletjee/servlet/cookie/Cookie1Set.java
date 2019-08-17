package pl.coderslab.servletjee.servlet.cookie;

import pl.coderslab.servletjee.servlet.post.Censor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setCookie")
public class Cookie1Set extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie c = new Cookie("User", "Coderslab");
        c.setPath("/");
        c.setMaxAge(60*60*24);

        resp.addCookie(c);

        resp.getWriter().println("Ustawiono ciasteczko");
    }
}
