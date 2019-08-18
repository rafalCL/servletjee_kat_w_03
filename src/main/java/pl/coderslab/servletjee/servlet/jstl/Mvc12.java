package pl.coderslab.servletjee.servlet.jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//W projekcie stwórz servlet `Mvc12` dostępny pod adresem **/mvc12** ,
//        który wczyta dwie zmienne GET : ```start``` i ```end``` . Następnie:
//        1. W servlecie zwiększ obie wartości o wartość `10`, przekaż zwiększone zmienne do widoku JSP .
//        2. W widoku wyświetl  wszystkie liczby  ```start``` do ```end```.

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String startStr = req.getParameter("start");
        final String endStr = req.getParameter("end");

        try {
            int start = Integer.parseInt(startStr);
            int end = Integer.parseInt(endStr);

            start += 10;
            end +=10;

            req.setAttribute("start", start);
            req.setAttribute("end", end);
        } catch (NumberFormatException e){
            System.out.println(e.toString());
        }

        getServletContext().getRequestDispatcher("/jsp12.jsp")
                .forward(req, resp);
    }
}
