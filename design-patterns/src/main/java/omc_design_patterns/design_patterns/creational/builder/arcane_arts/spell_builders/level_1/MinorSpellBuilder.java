package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.level_1;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.SpellBuilder;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.ArcaneMissile;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.DeadMinorSpell;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.Meteor;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.MinorSpell;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.SteamBlast;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.WaterWhip;

public class MinorSpellBuilder implements SpellBuilder {
	private boolean fire;
	private boolean water;
	private boolean air;
	private boolean earth;
	@Override
	public void beginIncantation() {
		System.out.println("Idis Savanu tethku sa vam...");
	}

	@Override
	public void castFire() {
		if(fire == true){
			System.out.print("Flamus taut");
		}
		else{
			System.out.print("Flamus");
		}
		fire = true;
	}

	@Override
	public void castWater() {
		if(water == true){
			System.out.print("Hydrus taut");
		}
		else{
			System.out.print("Hydrus");
		}
		water = true;
		
	}

	@Override
	public void castAir() {
		if(air == true){
			System.out.print("Aetus taut");
		}
		else{
			System.out.print("Aetus");
		}
		air = true;
		
	}

	@Override
	public void castEarth() {
		if(earth == true){
			System.out.print("Matus taut");
		}
		else{
			System.out.print("Matus");
		}
		earth = true;
		
	}

	@Override
	public MinorSpell endIncantation() {
		System.out.println();
		MinorSpell minorSpell;
		if(fire && air && !water && !earth){
			System.out.println("wizard cast arcane missile!");
			minorSpell = new ArcaneMissile();
		}
		else if(fire && earth && !water && !air){
			System.out.println("wizard cast meteor!");
			minorSpell = new Meteor();
		}
		else if(fire && water && !earth && !air){
			System.out.println("wizard cast steam blast!");
			minorSpell = new SteamBlast();
		}
		else if(water && air && !earth && !fire){
			System.out.println("wizard cast water whip!");
			minorSpell = new WaterWhip();
		}
		else{
			System.out.println("wizard cast a dead minor spell.");
			minorSpell = new DeadMinorSpell();
		}
		return minorSpell;
	}

	@Override
	public int getSpellLevel() {
		return 1;
	}
	


}
