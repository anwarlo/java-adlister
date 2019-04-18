import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.lang.String;

@WebServlet(urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setAttribute("ads",DaoFactory.getAdsDao().all());
        request.getRequestDispatcher("/ads/index.jsp").forward(request,response);

    }

}
