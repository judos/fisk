package view;

import java.util.ArrayList;

import model.World;
import model.buildings.BuildingType;
import model.space.Planet;
import model.user.Player;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class BuildingContentHtml {

	private Player player;
	private World world;

	public BuildingContentHtml(World world, Player player) {
		this.player = player;
		this.world = world;
	}

	public String getHtml() {
		ArrayList<BuildingType> buildings = this.world.getBuildings();
		Planet currentPlanet = this.player.getCurrentPlanet();
		StringBuffer result = new StringBuffer();
		for (BuildingType b : buildings) {
			result.append("<a href=\"?build=" + b.getName() + "\">" + b.getName()
				+ "</a> ");
		}
		return result.toString();
	}

}
