package model.technologies.detailed;

import model.GameParameters;
import model.Ressources;
import model.technologies.TechnologyType;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class ShieldTech extends TechnologyType {

	public ShieldTech() {
		// TODO: fill in ress costs
		super(GameParameters.SHIELD_TECH_NAME, new Ressources());
	}

}
