package model.technologies.detailed;

import model.GameParameters;
import model.Ressources;
import model.technologies.groups.WaffenTech;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class LaserTech extends WaffenTech {

	public LaserTech() {
		// TODO: fill in ress costs
		super(GameParameters.LASER_TECH_NAME, new Ressources());
	}

}
