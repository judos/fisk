package model.user;

import java.util.HashSet;

import model.space.Planet;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Actor {

	protected String name;
	protected HashSet<Planet> planets;

	public Actor(String name) {
		this.name = name;
		this.planets = new HashSet<Planet>();
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

}
