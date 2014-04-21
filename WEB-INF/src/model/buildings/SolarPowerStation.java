package model.buildings;

import model.GameParameters;
import model.Ressources;

public class SolarPowerStation extends EnergyBuilding {

	public SolarPowerStation(Ressources cost) {
		super(GameParameters.SOLAR_POWER_STATION_NAME, cost,
				GameParameters.COST_FACTOR);
	}

}
