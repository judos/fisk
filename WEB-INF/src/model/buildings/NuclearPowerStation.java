package model.buildings;

import model.GameParameters;
import model.Ressources;

public class NuclearPowerStation extends EnergyBuilding {

	public NuclearPowerStation(Ressources cost) {
		super(GameParameters.NUCLEAR_POWER_STATION_NAME, cost,
				GameParameters.COST_FACTOR);
	}

}
