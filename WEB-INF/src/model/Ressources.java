package model;

import java.security.InvalidParameterException;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Ressources {

	public static final String[] RESSOURCE_NAMES = new String[] { "Metal", "Antimony",
		"Greengoo" };

	public static int getNrOfRessources() {
		return RESSOURCE_NAMES.length;
	}

	private double[] ress;

	public Ressources() {
		this.ress = new double[getNrOfRessources()];
		initEmptyStorage();
	}

	public Ressources(double metal, double antimony, double greengoo) {
		this.ress = new double[] { metal, antimony, greengoo };
	}

	private void initEmptyStorage() {
		for (int i = 0; i < getNrOfRessources(); i++)
			this.ress[i] = 0;
	}

	public boolean hasAtLeast(Ressources cost) {
		for (int i = 0; i < getNrOfRessources(); i++)
			if (this.ress[i] < cost.ress[i])
				return false;
		return true;
	}

	public void subtract(Ressources cost) {
		for (int i = 0; i < getNrOfRessources(); i++)
			if (this.ress[i] < cost.ress[i])
				throw new InvalidParameterException(
					"Not enough ressources to subtract this amount");
		for (int i = 0; i < getNrOfRessources(); i++) {
			this.ress[i] -= cost.ress[i];
		}
	}

	public void add(Ressources gain) {
		for (int i = 0; i < getNrOfRessources(); i++) {
			this.ress[i] += gain.ress[i];
		}
	}

	public void multiply(double factor) {
		for (int i = 0; i < getNrOfRessources(); i++) {
			this.ress[i] *= factor;
		}
	}

	public double getAmountOf(String ressName) {
		for (int i = 0; i < RESSOURCE_NAMES.length; i++) {
			if (RESSOURCE_NAMES[i].equals(ressName))
				return this.ress[i];
		}
		throw new InvalidParameterException("Invalid Ressource Name");
	}

	/**
	 * @param index
	 * @return
	 */
	public double getRessourcePartByIndex(int index) {
		return this.ress[index];
	}

}
