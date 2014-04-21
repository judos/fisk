package model.user;

import java.util.HashMap;
import java.util.HashSet;

import model.space.Planet;
import model.technologies.Technology;
import model.technologies.TechnologyType;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Actor {

	protected String name;
	protected HashSet<Planet> planets;
	protected HashMap<TechnologyType, Technology> tech;

	public Actor(String name) {
		this.name = name;
		this.planets = new HashSet<Planet>();
		this.tech = new HashMap<TechnologyType, Technology>();
	}

	public void addPlanet(Planet p) {
		p.setOwner(this);
		this.planets.add(p);
	}

	public void removePlanet(Planet p) {
		this.planets.remove(p);
	}

	public String getName() {
		return this.name;
	}

	public HashSet<Planet> getPlanets() {
		return this.planets;
	}

	public Technology getTechnologyByType(TechnologyType type) {
		return this.tech.get(type);
	}

}
