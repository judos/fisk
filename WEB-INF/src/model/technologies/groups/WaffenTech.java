package model.technologies.groups;

import model.Ressources;
import model.technologies.TechnologyType;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public abstract class WaffenTech extends TechnologyType {

	public WaffenTech(String name, Ressources cost, int maxLevel) {
		super(name, cost, maxLevel);
	}

	public WaffenTech(String name, Ressources cost) {
		this(name, cost, Integer.MAX_VALUE);
	}

}
