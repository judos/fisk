package model.ships;

import model.Ressources;

public class ShipType {

	protected double attack;
	protected double def;
	protected Ressources cost;

	public ShipType(double attack, double def, Ressources cost) {
		this.attack = attack;
		this.def = def;
		this.cost = cost;
	}

}
