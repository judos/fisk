package model.buildings;

import model.GameParameters;
import model.Ressources;

public class SolarPowerPlant extends EnergyBuilding {

	public SolarPowerPlant(Ressources cost) {
		super(GameParameters.SOLAR_POWER_STATION_NAME, cost,
				GameParameters.COST_FACTOR);
	}

}
