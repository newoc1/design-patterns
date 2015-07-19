package omc_design_patterns.design_patterns.structural.flyweight.game;

import omc_design_patterns.design_patterns.structural.flyweight.environments.EnvironmentBlock;

import omc_design_patterns.design_patterns.structural.flyweight.environments.EnvironmentBlock;

public class Tile {
	private int x;
	private int y;
	private EnvironmentBlock environmentBlock;
	public Tile(int x,int y, EnvironmentBlock environmentBlock){
		this.x = x;
		this.y = y;
		this.environmentBlock = environmentBlock;
	}
}
