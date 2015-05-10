package omc_design_patterns.design_patterns.creational.builder.attributes;

public class DamageOverTime {
	private int ticks;
	private int damageValue;
	public DamageOverTime(int ticks, int damageValue){
		this.ticks = ticks;
		this.damageValue = damageValue;
	}
	public DamageOverTime() {
		
	}
	public int getTicks() {
		return ticks;
	}
	public void setTicks(int ticks) {
		this.ticks = ticks;
	}
	public int getDamageValue() {
		return damageValue;
	}
	public void setDamageValue(int damageValue) {
		this.damageValue = damageValue;
	}
	
	
}
