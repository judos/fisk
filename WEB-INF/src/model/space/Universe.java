package model.space;

import java.awt.Point;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Universe {

	protected SpaceObject[][] objects;

	public Universe(int width, int height) {
		this.objects = new SpaceObject[width][height];
	}

	public void addSpaceObjectAt(SpaceObject obj) {
		this.objects[obj.getX()][obj.getY()] = obj;
	}

	public boolean isFreePoint(Point coord) {
		return this.objects[coord.x][coord.y] == null;
	}
}
