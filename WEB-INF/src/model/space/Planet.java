package model.space;

import java.awt.Point;

import model.Ressources;
import model.user.User;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Planet extends SpaceObject {

	protected Ressources storage;
	protected User owner;

	public Planet(Point location) {
		super(location);
		this.storage = new Ressources();
		this.owner = null;
	}

	@Override
	public String toString() {
		return "Planet " + this.position.x + " / " + this.position.y;
	}

	public void setUser(User user) {
		this.owner = user;
	}
}
