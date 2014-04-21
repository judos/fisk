package model;

import java.awt.Point;

import model.buildings.AntimonyMine;
import model.buildings.Biosphere;
import model.buildings.BuildingType;
import model.buildings.Laboratory;
import model.buildings.MetalMine;
import model.buildings.NuclearPowerStation;
import model.buildings.SolarPowerStation;
import model.buildings.SpaceShipYard;
import model.space.Planet;
import model.space.Universe;
import model.user.Player;
import model.util.RandomJS;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class WorldFactory {

	public static World createTestWorld() {

		int uWidth = 10;
		int uHeight = 10;
		Universe u = new Universe(uWidth, uHeight);

		World w = new World(u);
		BuildingType[] buildings = new BuildingType[] { new MetalMine(),
				new AntimonyMine(), new Biosphere(), new Laboratory(),
				new SolarPowerStation(), new NuclearPowerStation(),
				new SpaceShipYard() };
		for (BuildingType t : buildings)
			w.addBuilding(t);

		String[] names = new String[] { "judos", "ropeko", "muspelheim",
				"sirtoby" };
		for (String name : names) {

			Player user = new Player(name);
			w.addActor(user);
			do {
				Point coord = RandomJS.getPoint(0, uWidth - 1, 0, uHeight - 1);
				if (u.isFreePoint(coord)) {
					Planet planet = new Planet(coord);
					user.addPlanet(planet);
					u.addSpaceObjectAt(planet);
					break;
				}
			} while (true);
		}
		return w;
	}

}
