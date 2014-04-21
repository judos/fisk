package model.space;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import model.Requirements;
import model.Ressources;
import model.buildings.Building;
import model.buildings.BuildingType;
import model.technologies.Technology;
import model.technologies.TechnologyType;
import model.user.Actor;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Planet extends SpaceObject {

	protected Ressources storage;
	protected double energy;
	protected Actor owner;
	protected HashMap<BuildingType, Building> buildings;
	protected HashMap<TechnologyType, Technology> technologies;

	public Planet(Point location) {
		super(location);
		this.storage = new Ressources();
		this.owner = null;
		this.energy = 0;
		this.buildings = new HashMap<BuildingType, Building>();
		this.technologies = new HashMap<TechnologyType, Technology>();
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
			if (!hasBuilding(buildingType)) {
				if (!fulfillRequirements(buildingType)) {
					return;
				}
				addBuilding(buildingType);
			}
			this.storage.subtract(cost);
			building.increaseLevel();
		}
	}

	public void upgradeTechnology(TechnologyType technologyType) {
		Technology technology = this.technologies.get(technologyType);
		Ressources cost = technology.getCostsForNextLevel();
		if (this.storage.hasAtLeast(cost) && technology.isUpgradeable()) {
			if (!hasTechnology(technologyType)) {
				if (!fulfillRequirements(technologyType)) {
					return;
				}
				addTechnology(technologyType);
			}
			this.storage.subtract(cost);
			technology.increaseLevel();
		}
	}

	public boolean fulfillRequirements(Object type) {
		Requirements requirements;
		if (type instanceof BuildingType) {
			requirements = ((BuildingType) type).getRequirements();
		} else {
			requirements = ((TechnologyType) type).getRequirements();
		}
		return fulfillBuildingRequirements(requirements)
				&& fulfillTechnologyRequirements(requirements);
	}

	private boolean fulfillBuildingRequirements(Requirements requirements) {
		for (Map.Entry<String, Integer> set : requirements
				.getBuildingRequirements().entrySet()) {
			if (this.buildings.containsKey(set.getKey())) {
				Building building = this.buildings.get(set.getKey());
				if (building.getLevel() < set.getValue()) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean fulfillTechnologyRequirements(Requirements requirements) {
		for (Map.Entry<String, Integer> set : requirements
				.getTechnologyRequirements().entrySet()) {
			if (this.technologies.containsKey(set.getKey())) {
				Technology technology = this.technologies.get(set.getKey());
				if (technology.getLevel() < set.getValue()) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean hasBuilding(BuildingType buildingType) {
		return this.buildings.containsKey(buildingType);
	}

	public boolean hasTechnology(TechnologyType technologyType) {
		return this.technologies.containsKey(technologyType);
	}

	public void addBuilding(BuildingType buildingType) {
		if (!hasBuilding(buildingType)) {
			this.buildings.put(buildingType, new Building(buildingType));
		}
	}

	private void addTechnology(TechnologyType technologyType) {
		if (!hasTechnology(technologyType)) {
			this.technologies.put(technologyType,
					new Technology(technologyType));
		}
	}

	public Ressources getRessources() {
		return this.storage;
	}

	public Building getBuildingByType(BuildingType type) {
		addBuilding(type);
		return this.buildings.get(type);
	}

	public double getEnergy() {
		return this.energy;
	}

	public void consumeEnergy(double energyCost) {
		this.energy -= energyCost;
	}

}
