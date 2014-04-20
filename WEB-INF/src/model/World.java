package model;

import java.util.ArrayList;

import model.buildings.BuildingType;
import model.ships.ShipType;
import model.space.Universe;
import model.technologies.Technology;
import model.user.Actor;
import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class World {

	protected Universe universe;
	protected ArrayList<Actor> actors;
	protected ArrayList<BuildingType> buildings;
	protected ArrayList<Technology> technologies;
	protected ArrayList<ShipType> ships;

	public World(Universe u) {
		this.universe = u;
		this.actors = new ArrayList<Actor>();
		this.buildings = new ArrayList<BuildingType>();
		this.technologies = new ArrayList<Technology>();
		this.ships = new ArrayList<ShipType>();
	}

	/**
	 * @return the universe
	 */
	public Universe getUniverse() {
		return universe;
	}

	public ArrayList<BuildingType> getBuildings() {
		return this.buildings;
	}

	/**
	 * @return the actors
	 */
	public ArrayList<Actor> getActors() {
		return actors;
	}

	/**
	 * @return the technologies
	 */
	public ArrayList<Technology> getTechnologies() {
		return technologies;
	}

	/**
	 * @return the ships
	 */
	public ArrayList<ShipType> getShips() {
		return ships;
	}

	public void addActor(Actor p) {
		this.actors.add(p);
	}

	public void addBuilding(BuildingType b) {
		this.buildings.add(b);
	}

	public void addTechnology(Technology t) {
		this.technologies.add(t);
	}

	public void addShip(ShipType s) {
		this.ships.add(s);
	}

	public Player getPlayerByName(String name) {
		for (Actor a : this.actors) {
			if (a.getName().equals(name))
				return (Player) a;
		}
		return null;
	}

}
