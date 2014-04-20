package model.space;

import java.awt.Point;

import model.user.User;
import model.util.RandomJS;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class SpaceFactory {

	public static Universe createTestUniverse() {
		int uWidth = 10;
		int uHeight = 10;
		Universe u = new Universe(uWidth, uHeight);

		String[] names = new String[] { "judos", "ropeko", "muspelheim", "sirtoby" };
		for (String name : names) {

			User user = new User(name);
			do {
				Point coord = RandomJS.getPoint(0, uWidth - 1, 0, uHeight - 1);
				if (u.isFreePoint(coord)) {
					Planet planet = new Planet(coord);
					planet.setUser(user);
					u.addSpaceObjectAt(planet);
					break;
				}
			} while (true);
		}
		return u;
	}
}
