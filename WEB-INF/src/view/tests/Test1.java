package view.tests;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.World;
import model.space.WorldFactory;
import model.user.Player;
import view.HtmlRender;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Test1 extends HttpServlet {

	private World world;
	private HashMap<String, Player> login;
	private int counter;

	public Test1() {
		this.world = WorldFactory.createTestWorld();

		this.login = new HashMap<>();
		login.put("192.168.0.18", this.world.getPlayerByName("ropeko"));
		login.put("192.168.0.13", this.world.getPlayerByName("judos"));
		login.put("192.168.0.15", this.world.getPlayerByName("muspelheim"));
		login.put("192.168.0.19", this.world.getPlayerByName("sirtoby"));

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

		String ip = request.getRemoteAddr().toString();
		Player currentPlayer = this.login.get(ip);

		String html = HtmlRender.getHtmlOutputForPlayer(currentPlayer, "" + this.counter);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(html);

	}

	public String doGet() {
		return "outdated";
	}

}
