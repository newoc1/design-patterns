package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.level_2;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.SpellBuilder;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.AncientVolcano;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.ArcaneBarrage;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.DeadMajorSpell;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.MajorSpell;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.SteamTornado;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.TidalWave;

public class MajorSpellBuilder implements SpellBuilder {

	private int fire;
	private int water;
	private int air;
	private int earth;

	@Override
	public void beginIncantation() {
		System.out.println("Mastnu deldaban vasta ko tain...");
	}

	@Override
	public void castFire() {
		System.out.print("Flamus");
		fire++;
	}

	@Override
	public void castWater() {
		System.out.print("Hydrus");
		water++;

	}

	@Override
	public void castAir() {
		System.out.print("Aetus");
		air++;

	}

	@Override
	public void castEarth() {
		System.out.print("Matus");
		earth++;

	}

	@Override
	public MajorSpell endIncantation() {
		System.out.println();
		MajorSpell majorSpell;
		if(fire > AncientVolcano.FIRE_VALUE && earth > AncientVolcano.EARTH_VALUE && air > AncientVolcano.AIR_VALUE && water == AncientVolcano.WATER_VALUE){
			System.out.println("wizard cast Ancient Volcano!");
			majorSpell = new AncientVolcano(fire+earth+air);
		}
		else if(fire > ArcaneBarrage.FIRE_VALUE && air > ArcaneBarrage.AIR_VALUE && water == ArcaneBarrage.WATER_VALUE && earth == ArcaneBarrage.EARTH_VALUE){
			System.out.println("wizard cast Arcane Barrage!");
			majorSpell = new ArcaneBarrage(fire+air);
		}
		else if( fire == SteamTornado.FIRE_VALUE && water == SteamTornado.WATER_VALUE && air == SteamTornado.AIR_VALUE && earth == SteamTornado.EARTH_VALUE){
			System.out.println("wizard cast Steam Tornado!");
			majorSpell = new SteamTornado();
		}
		else if(water > TidalWave.WATER_VALUE && fire == TidalWave.FIRE_VALUE && air == TidalWave.AIR_VALUE && earth == TidalWave.EARTH_VALUE){
			System.out.println("wizard cast Tidal Wave!");
			majorSpell = new TidalWave();
		}
		else{
			System.out.println("wizard cast a dead major spell.");
			majorSpell = new DeadMajorSpell();
		}
		return majorSpell;
	}

	@Override
	public int getSpellLevel() {
		return 2;
	}

}
