package model;

public class GameParameters {

	public static final double START_METAL = 1000;
	public static final double START_ANTIMONY = 100;
	public static final double POLYP_ATTACK = 100;
	public static final double POLYP_DEF = 50;
	public static final double COST_FACTOR = 2;
	public static final double METAL_MINE_PRODUCTION = 5;
	public static final double METAL_MINE_PRODUCTION_FACTOR = 1.15;
	public static final double METAL_MINE_COST_FACTOR = 1.4;
	public static final double METAL_MINE_ENERGY = 10;
	public static final double ANTIMONY_MINE_PRODUCTION = 5;
	public static final double ANTIMONY_MINE_PRODUCTION_FACTOR = 1.2;
	public static final double ANTIMONY_MINE_COST_FACTOR = 1.45;
	public static final double ANTIMONY_MINE_ENERGY = 10;
	public static final double SPACE_SHIPYARD_ENERGY = 10;
	public static final double BIOSPHERE_ENERGY = 10;
	public static final double LABORATORY_ENERGY = 10;
	public static final double NUCLEAR_POWER_PLANT_ENERGY = -50;
	public static final double SOLAR_POWER_PLANT_ENERGY = -20;

	// TODO: replace with real values
	public static final Ressources METAL_MINE_COSTS = new Ressources(40, 10, 0);
	public static final Ressources ANTIMONY_MINE_COSTS = new Ressources(30, 20, 0);
	public static final Ressources BIOSPHERE_COSTS = new Ressources(100, 50, 1);
	public static final Ressources LABORATORY_COSTS = new Ressources(200, 1000, 5);
	public static final Ressources NUCLEAR_POWER_PLANT_COSTS = new Ressources(50, 100, 0);
	public static final Ressources SOLAR_POWER_PLANT_COSTS = new Ressources(60, 20, 0);
	public static final Ressources SPACE_SHIPYARD_COSTS = new Ressources(100, 70, 3);
	public static final Ressources POLYP_RESSOURCE = new Ressources(100, 10, 1);
	public static final String ANTIMONY_MINE_NAME = "Antimony Mine";
	public static final String BIOSPHERE_NAME = "Biosphere";
	public static final String METAL_MINE_NAME = "Metal Mine";
	public static final String LABORATORY_NAME = "Laboratory";
	public static final String NUCLEAR_POWER_PLANT_NAME = "Nuclear Power Plant";
	public static final String SOLAR_POWER_PLANT_NAME = "Solar Power Plant";
	public static final String SPACE_SHIPYARD_NAME = "Space Shipyard";

}
