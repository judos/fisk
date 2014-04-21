package model.buildings;

import model.GameParameters;

public class NuclearPowerStation extends EnergyBuilding {

	public NuclearPowerStation() {
		super(GameParameters.NUCLEAR_POWER_STATION_NAME,
				GameParameters.NUCLEAR_POWER_STATION_COSTS,
				GameParameters.COST_FACTOR);
	}

}
