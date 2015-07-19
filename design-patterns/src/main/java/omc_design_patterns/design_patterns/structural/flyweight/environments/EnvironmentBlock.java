package omc_design_patterns.design_patterns.structural.flyweight.environments;

import omc_design_patterns.design_patterns.structural.flyweight.graphics.Texture;

public abstract class EnvironmentBlock {
	protected int movementSpeedModifier;
	protected int visibilityModifier;
	protected EnvironmentType environmentType;
	protected Texture texture;
	public EnvironmentBlock(int movementSpeedModifier, int visibilityModifier, Texture texture){
		this.movementSpeedModifier = movementSpeedModifier;
		this.visibilityModifier = visibilityModifier;
		this.texture = texture;
	}
	public Texture getTexture() {
		return texture;
	}
	public int getMovementSpeedModifier() {
		return movementSpeedModifier;
	}
	public int getVisibilityModifier() {
		return visibilityModifier;
	}
	public EnvironmentType getEnvironmentType() {
		return environmentType;
	}
}