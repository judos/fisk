package model.buildings;

import model.GameParameters;

public class SolarPowerPlant extends EnergyBuilding {

	public SolarPowerPlant() {
		super(GameParameters.SOLAR_POWER_STATION_NAME,
				GameParameters.SOLAR_POWER_STATION_COSTS,
				GameParameters.COST_FACTOR);
	}

}
