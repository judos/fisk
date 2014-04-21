package view;

import model.World;
import model.user.Player;
import control.server.Debug;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class PlayerPerspective {

	private Player player;
	private World world;

	public PlayerPerspective(World world, Player p) {
		this.player = p;
		this.world = world;
	}

	public String getHtml() {
		String currentPage = this.player.getCurrentPage();

		Debug.addMsg("current page: " + currentPage);
		Debug.addMsg("Menu Buildings: " + MenuHtml.BUILDINGS);
		if (currentPage == MenuHtml.BUILDINGS)
			return new BuildingContentHtml(this.world, this.player).getHtml();

		return "Hello " + this.player.getName() + "<br>" + "Shows Page: "
			+ this.player.getCurrentPage();
	}

}
