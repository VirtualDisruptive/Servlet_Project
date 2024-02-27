package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = String.valueOf(request.getParameter("name"));
		String lname = String.valueOf(request.getParameter("lname"));
		request.setAttribute("name", name);
		request.setAttribute("lname", lname);

		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		// send HTML page to client
		request.getRequestDispatcher("/WEB-INF/pagina2.jsp").forward(request,response);
	}

}