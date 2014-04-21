package view;

import model.Ressources;
import model.html.HtmlUtil;
import model.space.Planet;
import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class HeaderHtml {
	private Player player;

	public HeaderHtml(Player player) {
		this.player = player;
	}

	public String getHtml() {
		StringBuffer result = new StringBuffer();

		// Ressources
		Planet current = this.player.getCurrentPlanet();
		if (current != null) {
			Ressources stored = current.getRessources();
			for (String ressName : Ressources.RESSOURCE_NAMES) {
				result.append("<span>" + ressName + ": "
						+ stored.getAmountOf(ressName) + "</span>");
			}

			// Energy
			double freeEnergy = current.getFreeEnergy();
			double totalEnergy = current.getTotalEnergy();
			String color = "green";
			if (freeEnergy <= totalEnergy * 0.75) {
				color = "lightgreen";
				if (freeEnergy <= totalEnergy * 0.5) {
					color = "orange";
					if (freeEnergy <= totalEnergy * 0.25) {
						color = "red";
					}
				}
			}
			result.append(HtmlUtil.span(
					"color:" + color,
					"Energy: " + Math.round(freeEnergy) + "/"
							+ Math.round(totalEnergy)));
		}

		// Planets
		result.append("<span>Planets: <select>");
		for (Planet p : this.player.getPlanets()) {
			result.append("<option>" + p.getX() + " / " + p.getY()
					+ "</option>");
		}
		result.append("</select></span>");
		return result.toString();
	}
}
