package control.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.World;
import model.WorldFactory;
import model.user.Player;
import view.HtmlRender;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Server extends HttpServlet {

	private World world;
	private HashMap<String, String> login;
	private int counter;
	private HtmlRender renderer;
	private boolean initialized;
	private String projectPath;

	public Server() throws IOException {
		super();
		this.world = WorldFactory.createTestWorld();

		this.login = new HashMap<String, String>();
		login.put("192.168.0.18", "ropeko");
		login.put("192.168.0.13", "judos");
		login.put("192.168.0.15", "muspelheim");
		login.put("192.168.0.19", "sirtoby");

		this.counter = 0;
		Thread t = new Thread() {
			@Override
			public void run() {
				while (true) {
					counter++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		};
		t.start();
	}

	private static final long serialVersionUID = -5406383912075778580L;

	/**
	 * @param args
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		if (!this.initialized)
			initialize();

		String ip = request.getRemoteAddr().toString();
		Player currentPlayer = this.world.getPlayerByName(this.login.get(ip));

		Map<String, String[]> x = request.getParameterMap();
		String debug = "";
		for (String key : x.keySet()) {
			debug += key + " = ";
			for (String value : x.get(key)) {
				debug += value + ", ";
			}
		}

		PlayerActions action = new PlayerActions(currentPlayer);
		action.evaluate(request);

		String html = this.renderer.getHtmlOutputForPlayer(this.world, currentPlayer, ""
			+ debug);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(html);

	}

	private void initialize() throws IOException {
		this.projectPath = getServletContext().getRealPath(".");
		this.renderer = new HtmlRender(projectPath);
		this.initialized = true;
	}

	public String doGet() {
		return "outdated";
	}

}
