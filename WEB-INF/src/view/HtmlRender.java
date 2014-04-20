package view;

import java.io.File;
import java.io.IOException;

import model.World;
import model.space.Planet;
import model.user.Player;
import model.util.FileUtils;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class HtmlRender {
	public static final String HTML_TEMPLATE_FILE = "template.html";
	private String cache;

	public HtmlRender(String projectPath) throws IOException {

		// Read the whole template and store it in cache
		this.cache = FileUtils.readAllFile(new File(projectPath, HTML_TEMPLATE_FILE));

	}

	public String getHtmlOutputForPlayer(World world, Player p, String debugInfo) {
		String html = new String(cache);

		// insert menu
		Menu menu = new Menu(p);
		html = html.replaceFirst("_MENU_", menu.getHtml());

		// insert main content
		PlayerPerspective playerPerspective = new PlayerPerspective(p);
		html = html.replaceFirst("_CONTENT_", playerPerspective.getHtml());

		// replace ressources
		Planet planet = p.getCurrentPlanet();
		if (planet != null) {
			RessourceHtml ress = new RessourceHtml(planet.getRessources());
			html = html.replaceFirst("_RESSOURCES_", ress.getHtml());
		}
		else
			html = html.replaceFirst("_RESSOURCES_", "- No Planet selected - ");

		return html;
	}
}
