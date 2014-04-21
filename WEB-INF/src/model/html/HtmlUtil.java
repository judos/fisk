package model.html;

import model.Ressources;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class HtmlUtil {
	public static String a(String url, String name) {
		return "<a href=\"" + url + "\">" + name + "</a>";
	}

	public static String img(String url, String style) {
		return "<img src=\"" + url + "\" style=\"" + style + "\" />";
	}

	public static String ressourceVertical(Ressources r) {
		StringBuffer out = new StringBuffer("<ul>");
		String[] names = Ressources.RESSOURCE_NAMES;
		for (int i = 0; i < Ressources.getNrOfRessources(); i++) {
			out.append("<li>" + names[i] + ": "
				+ Math.round(r.getRessourcePartByIndex(i)) + "</li>");
		}
		out.append("</ul>");
		return out.toString();
	}
}
