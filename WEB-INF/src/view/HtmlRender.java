package view;

import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class HtmlRender {
	public static String getHtmlOutputForPlayer(Player p, String debugInfo) {

		return "<html><body>You are logged in as User: " + p.getName() + "<br>"
			+ debugInfo + "</body></html>";
	}
}
