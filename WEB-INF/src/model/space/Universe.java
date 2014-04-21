package model.space;

import java.awt.Point;
import java.security.InvalidParameterException;
import java.util.HashMap;

import control.server.ServerClockListener;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Universe implements ServerClockListener {

	protected HashMap<Point, SpaceObject> objects;
	private int minX;
	private int maxX;
	private int minY;
	private int maxY;

	public Universe() {
		this.objects = new HashMap<Point, SpaceObject>();
		this.minX = Integer.MAX_VALUE;
		this.maxX = Integer.MIN_VALUE;
		this.minY = Integer.MAX_VALUE;
		this.maxY = Integer.MIN_VALUE;
	}

	public void addSpaceObjectAt(SpaceObject obj) {
		if (this.objects.containsKey(obj.getLocation()))
			throw new InvalidParameterException(
				"This Point in space is already used by an object: "
					+ this.objects.get(obj.getLocation()));
		this.objects.put(obj.getLocation(), obj);
	}

	public boolean isFreePoint(Point coord) {
		return !this.objects.containsKey(coord);
	}

	@Override
	public void onNewSecond(int serverTime) {
		for (SpaceObject x : this.objects.values()) {
			x.updateRessources1Second();
		}
	}
}
