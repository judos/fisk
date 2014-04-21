package view;

import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class MenuHtml {

	protected Player player;
	public static final String BUILDINGS = "Buildings";
	public static final String RESEARCH = "Research";
	public static final String MAP = "Map";
	public static final String ITEMS = "Items";
	public static final String COMMANDBRIDGE = "Commandbridge";
	public static final String STARGATE = "Stargate";

	public MenuHtml(Player p) {
		this.player = p;
	}

	public String getHtml() {
		StringBuffer html = new StringBuffer();
		addEntry(html, BUILDINGS);
		addEntry(html, RESEARCH);
		addEntry(html, MAP);
		addEntry(html, STARGATE);
		addEntry(html, COMMANDBRIDGE);
		addEntry(html, ITEMS);
		return html.toString();
	}

	private void addEntry(StringBuffer html, String name) {
		html.append("<a href=\"?page=" + name + "\">" + name + "</a><br>");
	}

}
