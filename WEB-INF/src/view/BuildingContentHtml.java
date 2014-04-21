package view;

import java.util.ArrayList;

import model.Ressources;
import model.World;
import model.buildings.Building;
import model.buildings.BuildingType;
import model.html.HtmlTable;
import model.html.HtmlUtil;
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

		HtmlTable html = new HtmlTable(4);

		for (BuildingType type : buildings) {

			Building building = currentPlanet.getBuildingByType(type);
			Ressources costNextLevel = building.getCostsForNextLevel();

			// TODO: display stufe and costs
			String link = "?build=" + type.getName();
			String title = type.getName()
				+ " "
				+ building.getLevel()
				+ "<br>"
				+ HtmlUtil.img("img/" + type.getName() + ".jpg",
					"width:200px;height:200px;") + "<br>"
				+ HtmlUtil.ressourceVertical(costNextLevel);
			if (building.isUpgradeable())
				html.addTd(HtmlUtil.a(link, title));
			else
				html.addTd(title);
		}
		return html.toString();
	}
}
