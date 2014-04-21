package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.World;
import model.user.Player;
import control.Debug;
import control.PlayerActions;
import control.server.Server;
import control.server.ServerFactory;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class Servlet extends HttpServlet {

	private String projectPath;
	private HtmlRender renderer;
	private boolean initialized;
	private HashMap<String, String> login;
	private static final long serialVersionUID = 313492259470568582L;

	private void initialize() throws IOException {
		this.projectPath = getServletContext().getRealPath(".");
		this.renderer = new HtmlRender(projectPath);

		this.login = new HashMap<String, String>();
		login.put("192.168.0.18", "ropeko");
		login.put("192.168.0.13", "judos");
		login.put("192.168.0.15", "muspelheim");
		login.put("192.168.0.19", "sirtoby");

		this.initialized = true;
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		if (!this.initialized)
			initialize();

		Server s = ServerFactory.getServer();
		World world = s.getWorld();

		String html = "";
		try {
			Debug.clear();
			String ip = request.getRemoteAddr().toString();
			Player currentPlayer = world.getPlayerByName(this.login.get(ip));

			PlayerActions action = new PlayerActions(currentPlayer);
			action.evaluate(request);

			html = this.renderer.getHtmlOutputForPlayer(world, currentPlayer, "");
		} catch (Exception e) {
			html = "Exception thrown: " + e.getMessage();

			StringWriter stringWriter = new StringWriter();
			PrintWriter writer = new PrintWriter(stringWriter);
			e.printStackTrace(writer);
			html += "<br>" + stringWriter.toString();
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(html);
	}
}
