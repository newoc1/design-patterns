package omc_design_patterns.design_patterns.creational.builder.actors.enemies;

import omc_design_patterns.design_patterns.creational.builder.actors.Actor;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.MinorSpell;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.MajorSpell;
import omc_design_patterns.design_patterns.creational.builder.attributes.DamageOverTime;
import omc_design_patterns.design_patterns.creational.builder.attributes.LifeLeech;
import omc_design_patterns.design_patterns.creational.builder.weapons.Weapon;

public class Goblin implements Enemy {
	private Weapon weapon;
	private int health;
	private DamageOverTime dot;

	public Goblin(Weapon weapon) {
		health = 250;
		this.weapon = weapon;
		dot = null;
	}

	@Override
	public void hitWizardWithWeapon(Wizard wizard) {
		System.out.println("goblin hit wizard for: " + weapon.getDamage());
		wizard.takeDamage(weapon.getDamage());
	}

	public int getHealth() {
		return health;
	}

	@Override
	public void takeDamage(int damage) {
		health -= damage;
		System.out.println("goblin took: " + damage + " damage!");
	}

	@Override
	public LifeLeech hitByMinorSpell(MinorSpell minorSpell) {
		takeDamage(minorSpell.getDamage());
		return new LifeLeech(minorSpell.getDamage() / 2);

	}

	@Override
	public void hitByMajorSpell(MajorSpell majorSpell) {
		takeDamage(majorSpell.getDamage());
		if (dot == null) {
			dot = new DamageOverTime();
		}
		dot.setTicks(dot.getTicks() + majorSpell.getDamageOverTime().getTicks());
		dot.setDamageValue(dot.getDamageValue()
				+ majorSpell.getDamageOverTime().getDamageValue());
	}

	@Override
	public void takeDamageOverTime() {
		if (dot != null) {
			if (dot.getTicks() > 0) {
				System.out.println("Goblin takes damage from damage over time");
				takeDamage(dot.getDamageValue());
				dot.setTicks(dot.getTicks() - 1);
			} else if (dot.getTicks() <= 0) {
				dot.setDamageValue(0);
			}
		}
	}
}
