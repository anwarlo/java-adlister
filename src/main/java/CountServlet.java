import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/count")
public class CountServlet extends HttpServlet {
    int count = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        count++;
        System.out.println("You will see this in the console when CountServlet doGet runs");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Page Count: " + count + "</h1>");
    }
}
