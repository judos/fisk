package view;

import model.World;
import model.user.Player;

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

		if (currentPage.equals(MenuHtml.BUILDINGS))
			return new BuildingContentHtml(this.world, this.player).getHtml();
		if (currentPage.equals(MenuHtml.RESEARCH))
			return new ResearchContentHtml(this.world, this.player).getHtml();

		return "Hello " + this.player.getName() + "<br>" + "Shows Page: "
			+ this.player.getCurrentPage();
	}

}
