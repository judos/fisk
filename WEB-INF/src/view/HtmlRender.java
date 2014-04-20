package view;

import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class HtmlRender {
	public static String getHtmlOutputForPlayer(Player p) {

		return "<html><body>You are logged in as User: " + p.getName() + "</body></html>";
	}
}
