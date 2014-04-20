package model.ships;

import model.GameParameters;

public class Polyp extends ShipType {

	public Polyp() {
		super(GameParameters.POLYP_ATTACK, GameParameters.POLYP_DEF,
				GameParameters.POLYP_RESSOURCE);
	}

}
