package view;

import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class PlayerPerspective {

	private Player player;

	public PlayerPerspective(Player p) {
		this.player = p;
	}

	public String getOutput() {
		return "Hello " + this.player.getName();
	}

}
