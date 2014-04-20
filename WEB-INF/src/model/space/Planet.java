package model.space;

import java.awt.Point;
import java.util.HashMap;

import model.Ressources;
import model.buildings.Building;
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
	protected HashMap<BuildingType, Building> buildings;

	public Planet(Point location) {
		super(location);
		this.storage = new Ressources();
		this.owner = null;
		this.buildings = new HashMap<BuildingType, Building>();
	}

	@Override
	public String toString() {
		return "Planet " + this.position.x + " / " + this.position.y;
	}

	public void setUser(Player user) {
		this.owner = user;
	}

	public void upgradeBuilding(BuildingType buildingType) {
		Building building = this.buildings.get(buildingType);
		Ressources cost = building.getCostsForNextLevel();
		if (this.storage.hasAtLeast(cost) && building.isUpgradeable()) {
			if (!hasBuilding(buildingType)) {
				addBuilding(buildingType);
			}
			this.storage.subtract(cost);
			building.increaseLevel();
		}
	}

	public boolean hasBuilding(BuildingType buildingType) {
		return this.buildings.containsKey(buildingType);
	}

	public void addBuilding(BuildingType buildingType) {
		if (!hasBuilding(buildingType)) {
			this.buildings.put(buildingType, new Building(buildingType));
		}
	}

	public Ressources getRessources() {
		return this.storage;
	}

}
