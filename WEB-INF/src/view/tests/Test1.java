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

	private static int counter;

	public Test1() {
		this.counter = 0;
	}

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
		out.println("<h1 align=\"center\">Hi Julian</h1><br>");
		out.println("Counter value is: " + this.counter);
		this.counter++;
		out.println("</body>");
		out.println("</html>");
	}

	public String doGet() {
		return "<html><body><h1 align=\"center\">Hi Julian</h1><br>Counter value is: "
			+ this.counter + "</body></html>";
	}

}
