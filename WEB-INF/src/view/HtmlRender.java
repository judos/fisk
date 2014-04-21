package view;

import java.io.File;
import java.io.IOException;

import model.World;
import model.user.Player;
import model.util.FileUtils;
import control.server.Debug;

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

	public String getHtmlOutputForPlayer(World world, Player player, String debugInfo) {
		String html = new String(cache);

		// insert menu
		MenuHtml menu = new MenuHtml(player);
		html = html.replaceFirst("_MENU_", menu.getHtml());

		// insert main content
		PlayerPerspective playerPerspective = new PlayerPerspective(world, player);
		html = html.replaceFirst("_CONTENT_", playerPerspective.getHtml());

		// replace ressources
		HeaderHtml ress = new HeaderHtml(player);
		html = html.replaceFirst("_HEADER_", ress.getHtml());

		// debug string added in footer
		html = html.replaceFirst("_DEBUG_", Debug.getInstance().getAllDebugMsgs());

		return html;
	}
}
