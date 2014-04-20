package model;

import java.security.InvalidParameterException;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class Ressources {

	public static final int NR_OF_RESSOURCES = 3;

	public static final int METAL = 0;
	public static final int ANTIMONY = 1;
	public static final int GREENGOO = 2;

	private double[] ress;

	public Ressources() {
		this.ress = new double[NR_OF_RESSOURCES];
		initEmptyStorage();
	}

	private void initEmptyStorage() {
		for (int i = 0; i < NR_OF_RESSOURCES; i++)
			this.ress[i] = 0;
	}

	public boolean hasAtLeast(Ressources cost) {
		for (int i = 0; i < NR_OF_RESSOURCES; i++)
			if (this.ress[i] < cost.ress[i])
				return false;
		return true;
	}

	public void subtract(Ressources cost) {
		for (int i = 0; i < NR_OF_RESSOURCES; i++)
			if (this.ress[i] < cost.ress[i])
				throw new InvalidParameterException(
					"Not enough ressources to subtract this amount");
		for (int i = 0; i < NR_OF_RESSOURCES; i++) {
			this.ress[i] -= cost.ress[i];
		}
	}

	public void add(Ressources gain) {
		for (int i = 0; i < NR_OF_RESSOURCES; i++) {
			this.ress[i] += gain.ress[i];
		}
	}

}
