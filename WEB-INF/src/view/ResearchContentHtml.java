package view;

import java.util.ArrayList;

import model.Ressources;
import model.World;
import model.html.HtmlTable;
import model.html.HtmlUtil;
import model.technologies.Technology;
import model.technologies.TechnologyType;
import model.user.Player;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class ResearchContentHtml {

	private World world;
	private Player player;

	public ResearchContentHtml(World world, Player player) {
		this.world = world;
		this.player = player;
	}

	public String getHtml() {
		ArrayList<TechnologyType> technologies = this.world.getTechnologies();

		HtmlTable html = new HtmlTable(4);

		for (TechnologyType type : technologies) {

			Technology technology = this.player.getTechnologyByType(type);
			Ressources costNextLevel = technology.getCostsForNextLevel();

			// TODO: display stufe and costs
			String link = "?research=" + type.getName();
			String title = type.getName()
				+ " "
				+ technology.getLevel()
				+ "<br>"
				+ HtmlUtil.img("img/" + type.getName() + ".jpg",
					"width:200px;height:200px;") + "<br>"
				+ HtmlUtil.ressourceVertical(costNextLevel);
			if (technology.isUpgradeable())
				html.addTd(HtmlUtil.a(link, title));
			else
				html.addTd(title);
		}
		return html.toString();
	}

}
