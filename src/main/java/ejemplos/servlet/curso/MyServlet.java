package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name);

		String lname = request.getParameter("lname");
		request.setAttribute("lname", lname);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println("<p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet. Aqui esta el formulario</p>");
		out.println("<form action=\"/myServlet2\">\n" +
				"  <label for=\"fname\">First name:</label><br>\n" +
				"  <input type=\"text\" id=\"name\" name=\"name\" value=\"John\"><br>\n" +
				"  <label for=\"lname\">Last name:</label><br>\n" +
				"  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"Doe\"><br><br>\n" +
				"  <input type=\"submit\" value=\"Submit\">\n" +
				"</form> ");

		out.println("</body></html>");
	}

}