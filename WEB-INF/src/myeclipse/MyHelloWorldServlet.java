package myeclipse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHelloWorldServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World (Servlet Example)</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align=\"center\">Hello World (Servlet Example)</h1>");
		out.println("<p>Hello World - Hi</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
