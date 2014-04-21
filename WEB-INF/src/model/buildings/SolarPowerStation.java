package model.buildings;

import model.GameParameters;

public class SolarPowerStation extends EnergyBuilding {

	public SolarPowerStation() {
		super(GameParameters.SOLAR_POWER_STATION_NAME,
				GameParameters.SOLAR_POWER_STATION_COSTS,
				GameParameters.COST_FACTOR);
	}

}
