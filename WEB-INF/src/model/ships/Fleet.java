package model.ships;

import java.util.HashMap;

public class Fleet {

	protected HashMap<ShipType, Integer> fleet;

	public Fleet() {
		this.fleet = new HashMap<ShipType, Integer>();
	}

	public void addShips(ShipType shipType, int numberOfShips) {
		if (this.fleet.containsKey(shipType)) {
			this.fleet.put(shipType, this.fleet.get(shipType) + numberOfShips);
		} else {
			this.fleet.put(shipType, numberOfShips);
		}
	}

	public void removeShips(ShipType shipType, int numberOfShipsToRemove) {
		if (this.fleet.containsKey(shipType)) {
			int numberOfShips = this.fleet.get(shipType);
			if (numberOfShips > numberOfShipsToRemove) {
				this.fleet.put(shipType, this.fleet.get(shipType)
						- numberOfShipsToRemove);
			} else if (numberOfShips == numberOfShipsToRemove) {
				this.fleet.remove(shipType);
			}
		}
	}

}
