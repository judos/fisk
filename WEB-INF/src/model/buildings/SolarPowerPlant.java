package model.buildings;

import model.GameParameters;

public class SolarPowerPlant extends Mine {

	public SolarPowerPlant() {
		super(GameParameters.SOLAR_POWER_PLANT_NAME,
				GameParameters.SOLAR_POWER_PLANT_COSTS,
				GameParameters.SOLAR_POWER_PLANT_COST_FACTOR,
				GameParameters.SOLAR_POWER_PLANT_PRODUCTION,
				GameParameters.SOLAR_POWER_PLANT_PRODUCTION_FACTOR,
				GameParameters.SOLAR_POWER_PLANT_ENERGY);
	}

}
