package view;

import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Menu {

	protected Player player;

	public Menu(Player p) {
		this.player = p;
	}

	public String getOutput() {
		StringBuffer html = new StringBuffer();
		addEntry(html, "Buildings");
		return html.toString();
	}

	private void addEntry(StringBuffer html, String name) {
		html.append("<a href=\"?page=" + name + "\">" + name + "</a><br>");
	}

}
