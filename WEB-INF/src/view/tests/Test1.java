package view.tests;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Test1 extends HttpServlet {

	private static final long serialVersionUID = -5406383912075778580L;

	/**
	 * @param args
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 align=\"center\">Hi Julian</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
