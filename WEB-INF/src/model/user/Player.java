package model.user;

import model.space.Planet;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Player extends Actor {

	protected Planet currentPlanet;

	public Player(String name) {
		super(name);
		this.currentPlanet = null;
	}

	public Planet getCurrentPlanet() {
		// return first planet if none was selected befor
		if (this.currentPlanet == null && this.planets.size() > 0)
			this.currentPlanet = this.planets.iterator().next();
		return this.currentPlanet;
	}
}
