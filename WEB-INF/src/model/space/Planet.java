package model.space;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import model.Ressources;
import model.buildings.Building;
import model.buildings.BuildingType;
import model.user.Actor;

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

	public void setOwner(Actor user) {
		this.owner = user;
	}

	public void upgradeBuilding(BuildingType buildingType) {
		Building building = this.buildings.get(buildingType);
		Ressources cost = building.getCostsForNextLevel();
		if (this.storage.hasAtLeast(cost) && building.isUpgradeable()) {
			if (!hasBuilding(buildingType) && fulfillRequirements(buildingType)) {
				addBuilding(buildingType);
			}
			this.storage.subtract(cost);
			building.increaseLevel();
		}
	}

	private boolean fulfillRequirements(BuildingType buildingType) {
		HashMap<String, Integer> requirements = buildingType.getRequirements();
		for (Map.Entry<String, Integer> set : requirements.entrySet()) {
			if (this.buildings.containsKey(set.getKey())) {
				Building building = this.buildings.get(set.getKey());
				if (building.getLevel() < set.getValue()) {
					return false;
				}
			}
		}
		return true;
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
