package model.ships;

public class Polyp extends ShipType {

	public final static double POLYP_ATTACK = 100;
	public final static double POLYP_DEF = 50;

	public Polyp() {
		super(POLYP_ATTACK, POLYP_DEF);
	}

}
