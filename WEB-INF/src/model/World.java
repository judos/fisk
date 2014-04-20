package model;

import java.util.ArrayList;

import model.ships.Ship;
import model.space.Universe;
import model.technologies.Technology;
import model.user.Actor;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class World {

	protected Universe universe;
	protected ArrayList<Actor> actors;
	protected ArrayList<Technology> technologies;
	protected ArrayList<Ship> ships;

	public World(Universe u) {
		this.universe = u;
		this.actors = new ArrayList<Actor>();
		this.technologies = new ArrayList<Technology>();
		this.ships = new ArrayList<Ship>();
	}

	public void addActor(Actor p) {
		this.actors.add(p);
	}

	public void addTechnology(Technology t) {
		this.technologies.add(t);
	}

	public void addShip(Ship s) {
		this.ships.add(s);
	}

}
