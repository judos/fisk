package model.space;

import java.awt.Point;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class SpaceObject {

	protected Point position;

	public SpaceObject(Point location) {
		this.position = location;
	}

	public int getX() {
		return this.position.x;
	}

	public int getY() {
		return this.position.y;
	}

	public Point getLocation() {
		return this.position;
	}

	public void updateRessources1Second() {

	}

}
