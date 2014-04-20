package view;

import model.Ressources;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class RessourceHtml {
	private Ressources ress;

	public RessourceHtml(Ressources r) {
		this.ress = r;
	}

	public String getHtml() {
		StringBuffer result = new StringBuffer();
		for (String ressName : Ressources.RESSOURCE_NAMES) {
			result.append("<span>" + ressName + ": " + this.ress.getAmountOf(ressName)
				+ "</span>");
		}
		return result.toString();
	}
}
