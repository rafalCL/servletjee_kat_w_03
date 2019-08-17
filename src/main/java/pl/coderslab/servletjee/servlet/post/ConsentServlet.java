package pl.coderslab.servletjee.servlet.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post2")
public class ConsentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String userText = req.getParameter("userText");
        final String consent = req.getParameter("consent");

        if(consent==null){
            String censoredText = Censor.censor(userText);
            resp.getWriter().println(censoredText);
        } else {
            resp.getWriter().println(userText);
        }
    }
}
