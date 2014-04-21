package model.buildings;

import model.GameParameters;

public class NuclearPowerPlant extends EnergyBuilding {

	public NuclearPowerPlant() {
		super(GameParameters.NUCLEAR_POWER_PLANT_NAME,
				GameParameters.NUCLEAR_POWER_PLANT_COSTS,
				GameParameters.COST_FACTOR,
				GameParameters.NUCLEAR_POWER_PLANT_ENERGY);
	}

}
