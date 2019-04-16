import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;



@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("You will see this in the console when HelloWorldServlet doGet runs");
        String name = request.getParameter("name");
        if (name == null) name = "World";

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        String message = "Hello" + name + "!";
        output.println("<h1>Hello, World!</h1>");
    }

}
