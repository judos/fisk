package model.user;

import model.space.Planet;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Player extends Actor {

	protected Planet currentPlanet;
	private String currentPage;

	public Player(String name) {
		super(name);
		this.currentPlanet = null;
		this.currentPage = "Buildings";
	}

	public Planet getCurrentPlanet() {
		// return first planet if none was selected befor
		if (this.currentPlanet == null && this.planets.size() > 0)
			this.currentPlanet = this.planets.iterator().next();
		return this.currentPlanet;
	}

	public void setCurrentPage(String newPage) {
		this.currentPage = newPage;
	}

	public String getCurrentPage() {
		return this.currentPage;
	}

}
