package model.technologies.detailed;

import model.GameParameters;
import model.Ressources;
import model.technologies.TechnologyType;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class ArmorTech extends TechnologyType {
	public ArmorTech() {
		// TODO: fill in ress costs
		super(GameParameters.ARMOR_TECH_NAME, new Ressources());
	}
}
