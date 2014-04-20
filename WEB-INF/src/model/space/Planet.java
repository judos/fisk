package model.space;

import java.awt.Point;
import java.util.HashMap;

import model.Ressources;
import model.buildings.BuildingType;
import model.user.Actor;
import model.user.Player;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Planet extends SpaceObject {

	protected Ressources storage;
	protected Actor owner;
	protected HashMap<BuildingType, Integer> buildings;

	public Planet(Point location) {
		super(location);
		this.storage = new Ressources();
		this.owner = null;
		this.buildings = new HashMap<BuildingType, Integer>();
	}

	@Override
	public String toString() {
		return "Planet " + this.position.x + " / " + this.position.y;
	}

	public void setUser(Player user) {
		this.owner = user;
	}

	public void upgradeBuilding(BuildingType buildingType) {
		int level = this.buildings.get(buildingType);
		if (true) {
			this.buildings.put(buildingType, level++);
		}
	}

}
