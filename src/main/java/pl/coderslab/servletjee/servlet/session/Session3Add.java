package pl.coderslab.servletjee.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/addToSession")
public class Session3Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        final String formStr = "    <form action=\"\" method=\"POST\">\n" +
                "        <label>\n" +
                "            Klucz:\n" +
                "            <input type=\"text\" name=\"key\">\n" +
                "        </label>\n" +
                "        <label>\n" +
                "            Wartość:\n" +
                "            <input type=\"text\" name=\"value\">\n" +
                "        </label>\n" +
                "        <input type=\"submit\">\n" +
                "    </form>";
        resp.getWriter().println(formStr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String key = req.getParameter("key");
        final String value = req.getParameter("value");

        if(key==null || value==null){
            return;
        }

        final HttpSession session = req.getSession();
        session.setAttribute(key, value);
        resp.getWriter().println("Dodano do sesji");
    }
}
