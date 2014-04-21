package model;

public class GameParameters {

	public static final Ressources POLYP_RESSOURCE = new Ressources(100, 10, 1);
	public static final double POLYP_ATTACK = 100;
	public static final double POLYP_DEF = 50;
	public static final double COST_FACTOR = 2;
	public static final double METAL_MINE_PRODUCTION = 5;
	public static final double METAL_MINE_PRODUCTION_FACTOR = 1.15;
	public static final double METAL_MINE_COST_FACTOR = 1.4;
	public static final double ANTIMONY_MINE_PRODUCTION = 5;
	public static final double ANTIMONY_MINE_PRODUCTION_FACTOR = 1.2;
	public static final double ANTIMONY_MINE_COST_FACTOR = 1.45;

	// TODO: replace with real values
	public static final Ressources METAL_MINE_COSTS = new Ressources(40, 10, 1);
	public static final Ressources ANTIMONY_MINE_COSTS = new Ressources(30, 20, 1);
	public static final Ressources BIOSPHERE_COSTS = new Ressources(1, 1, 1);
	public static final Ressources LABORATORY_COSTS = new Ressources(1, 1, 1);
	public static final Ressources NUCLEAR_POWER_STATION_COSTS = new Ressources(
			1, 1, 1);
	public static final Ressources SOLAR_POWER_STATION_COSTS = new Ressources(
			1, 1, 1);
	public static final Ressources SPACE_SHIP_YARD_COSTS = new Ressources(1, 1,
			1);
	public static final String ANTIMONY_MINE_NAME = "Antimony Mine";
	public static final String BIOSPHERE_NAME = "Biosphere";
	public static final String METAL_MINE_NAME = "Metal Mine";
	public static final String LABORATORY_NAME = "Laboratory";
	public static final String NUCLEAR_POWER_STATION_NAME = "Nuclear Power Station";
	public static final String SOLAR_POWER_STATION_NAME = "Solar Power Station";
	public static final String SPACE_SHIPYARD_NAME = "Space Shipyard";

}
