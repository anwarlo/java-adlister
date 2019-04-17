import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

   int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("Hello World servlet has run");

//        response.getWriter().println("<h1>Hello, World!</h1>");

        counter++;

        String name = request.getParameter("name");

        if (name == null) name = "World";

        request.setAttribute("name",name);
        request.setAttribute("count",counter);
        request.getRequestDispatcher("/hello.jsp").forward(request,response);

    }
}
