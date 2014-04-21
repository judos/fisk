package model.buildings;

import model.GameParameters;

public class SolarPowerPlant extends EnergyBuilding {

	public SolarPowerPlant() {
		super(GameParameters.SOLAR_POWER_PLANT_NAME,
				GameParameters.SOLAR_POWER_PLANT_COSTS,
				GameParameters.COST_FACTOR,
				GameParameters.SOLAR_POWER_PLANT_ENERGY);
	}

}
