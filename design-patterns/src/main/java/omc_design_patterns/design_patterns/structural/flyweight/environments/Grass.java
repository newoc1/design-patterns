package omc_design_patterns.design_patterns.structural.flyweight.environments;

import omc_design_patterns.design_patterns.structural.flyweight.graphics.Texture;

public class Grass extends EnvironmentBlock {

	protected Grass(int movementSpeedModifier, int visibilityModifier,
			Texture texture) {
		super(movementSpeedModifier, visibilityModifier, texture);
		this.environmentType = EnvironmentType.GRASS;
	}

}
