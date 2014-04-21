package model.buildings;

import model.GameParameters;

public class MetalMine extends Mine {

	public MetalMine() {
		super(GameParameters.METAL_MINE_NAME, GameParameters.METAL_MINE_COSTS,
				GameParameters.METAL_MINE_COST_FACTOR,
				GameParameters.METAL_MINE_PRODUCTION,
				GameParameters.METAL_MINE_PRODUCTION_FACTOR,
				GameParameters.METAL_MINE_ENERGY);
	}
}
