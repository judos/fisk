package model;

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

}
