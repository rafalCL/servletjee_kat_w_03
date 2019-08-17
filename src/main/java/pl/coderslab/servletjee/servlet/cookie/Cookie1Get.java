package pl.coderslab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showCookie")
public class Cookie1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Cookie[] cookies = req.getCookies();
        String userValue = null;

        for(Cookie c : cookies){
            if("User".equals(c.getName())){
                userValue = c.getValue();
                break;
            }
        }

        resp.getWriter().println("User: " + userValue);
    }
}
