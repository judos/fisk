package model.buildings;

import model.GameParameters;

public class AntimonyMine extends Mine {

	public AntimonyMine() {
		super(GameParameters.ANTIMONY_MINE_NAME,
				GameParameters.ANTIMONY_MINE_COSTS,
				GameParameters.ANTIMONY_MINE_COST_FACTOR,
				GameParameters.ANTIMONY_MINE_PRODUCTION,
				GameParameters.ANTIMONY_MINE_PRODUCTION_FACTOR,
				GameParameters.ANTIMONY_MINE_ENERGY);
	}
}
