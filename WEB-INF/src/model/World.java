package model;

import java.util.ArrayList;

import model.buildings.BuildingType;
import model.ships.ShipType;
import model.space.Universe;
import model.technologies.TechnologyType;
import model.user.Actor;
import model.user.Player;
import control.server.TaskHandlerI;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class World {

	protected Universe universe;
	protected ArrayList<Actor> actors;
	protected ArrayList<BuildingType> buildings;
	protected ArrayList<TechnologyType> technologies;
	protected ArrayList<ShipType> ships;
	protected TaskHandlerI taskHandler;

	/**
	 * @return the taskHandler
	 */
	public TaskHandlerI getTaskHandler() {
		return taskHandler;
	}

	public World(Universe u, TaskHandlerI th) {
		this.universe = u;
		this.taskHandler = th;
		this.actors = new ArrayList<Actor>();
		this.buildings = new ArrayList<BuildingType>();
		this.technologies = new ArrayList<TechnologyType>();
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
	public ArrayList<TechnologyType> getTechnologies() {
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

	public void addTechnology(TechnologyType t) {
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
