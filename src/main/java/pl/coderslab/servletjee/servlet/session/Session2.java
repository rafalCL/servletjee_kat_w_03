package pl.coderslab.servletjee.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // display form
        resp.setContentType("text/html");
        resp.getWriter().println("<form>");
        resp.getWriter().println("Ocena: <input type='text' name='ocena' />");
        resp.getWriter().println("<input type='submit' />");
        resp.getWriter().println("</form>");

        // get ocena from form
        String ocenaStr = req.getParameter("ocena");
        final int ocena = Integer.parseInt(ocenaStr);

        // get listaOcen from session
        HttpSession session = req.getSession();
        List<Integer> listaOcen = (List<Integer>)session
                .getAttribute("listaOcen");

        // if there were no listaOcen in session then set empty list
        if (listaOcen==null){
            listaOcen = new ArrayList<>();
        }

        // add ocena to listaOcen
        listaOcen.add(ocena);
        // set new value of listaOcen in session
        session.setAttribute("listaOcen", listaOcen);

        // display listaOcen under form
        resp.getWriter().println(Arrays.toString(listaOcen.toArray()));

        // calculate sum of listaOcen
        int sum = 0;

        for (Integer i : listaOcen){
            sum += i;
        }

        if(listaOcen.size()==0){
            // if there were no data, then display info to user
            resp.getWriter().println("avg = brak danych");
        } else {
            // if there were data then calculate avg and display to user
            resp.getWriter().println("avg = " + ((double)sum/listaOcen.size()));
        }
    }
}
