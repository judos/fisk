package control.server;

import javax.servlet.http.HttpServletRequest;

import model.user.Player;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class PlayerActions {

	private Player player;

	public PlayerActions(Player player) {
		this.player = player;
	}

	public void evaluate(HttpServletRequest request) {
		changePage(request);

	}

	private void changePage(HttpServletRequest request) {
		if (request.getParameterValues("page") == null)
			return;
		String newPage = request.getParameter("page");
		this.player.setCurrentPage(newPage);
	}

}
