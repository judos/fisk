package view;

import java.io.File;
import java.io.IOException;

import model.World;
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
		String menuHtml = menu.getOutput();
		html = html.replaceFirst("_MENU_", menuHtml);

		// insert main content
		PlayerPerspective playerPerspective = new PlayerPerspective(p);
		String content = playerPerspective.getOutput();
		html = html.replaceFirst("_CONTENT_", content);

		return html;
	}
}
