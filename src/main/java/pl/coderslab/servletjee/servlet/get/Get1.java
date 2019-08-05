package pl.coderslab.servletjee.servlet.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//#### Zadanie 1
//
//        1. W projekcie stwórz servlet `Get1`,
// dostępny pod adresem **/get1**,
//        który pobierze z adresu dwa parametry: ```start``` i ```end``` .
//        2. Po uruchomieniu aplikacji na serwerze, w przeglądarce wyświetlą się wszystkie liczby od ```start``` do ```end```.
//        (dla uproszczenia załóżmy, że będziemy przesyłać tylko liczby całkowite).
//        Jeżeli zmienne nie są przesłane, to strona ma wypisać informację `BRAK`.
//        3. Przykładowy adres wywołania: `http://localhost:8080/get1?start=1&end=12`;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String startStr = req.getParameter("start");
        final String endStr = req.getParameter("end");

//        if(startStr == null || endStr == null){
//            resp.getWriter().println("BRAK");
//            return;
//        }

        try {
            int start = Integer.parseInt(startStr);
            int end = Integer.parseInt(endStr);

            for (int i = start; i <= end; i++) {
                resp.getWriter().println(i);
            }
        } catch (NumberFormatException e){
            resp.getWriter().println("BRAK");
        }
    }
}
