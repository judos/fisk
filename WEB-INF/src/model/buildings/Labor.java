package model.buildings;

import model.GameParameters;
import model.Ressources;

public class Labor extends BuildingType {

	public Labor(Ressources cost) {
		super("Labor", cost);
		// TODO: adapt it, only an example
		this.requirements.put(GameParameters.METALMINE_NAME, 2);
	}
}
