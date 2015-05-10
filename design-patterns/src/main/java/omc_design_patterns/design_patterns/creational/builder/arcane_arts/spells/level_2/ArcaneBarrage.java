package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.DamageType;
import omc_design_patterns.design_patterns.creational.builder.attributes.DamageOverTime;

public class ArcaneBarrage implements MajorSpell {
	public static int FIRE_VALUE = 2;
	public static int WATER_VALUE = 0;
	public static int AIR_VALUE = 3;
	public static int EARTH_VALUE = 0;
	
	private int powerLevel;
	private Set<DamageType> damageTypes;
	public ArcaneBarrage(int powerLevel){
		this.powerLevel = powerLevel;
		damageTypes = new HashSet<>();
		damageTypes.add(DamageType.FIRE);
		damageTypes.add(DamageType.AIR);
	}
	@Override
	public Set<DamageType> getDamageTypes() {
		return damageTypes;
	}

	@Override
	public int getDamage() {
		return 75;
	}

	@Override
	public DamageOverTime getDamageOverTime() {
		return new DamageOverTime(1, 25);
	}

}
