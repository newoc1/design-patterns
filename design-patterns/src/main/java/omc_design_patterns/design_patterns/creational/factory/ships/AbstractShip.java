package omc_design_patterns.design_patterns.creational.factory.ships;

import java.util.List;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;

public class AbstractShip  {
	protected int hull;
	protected int shields;
	protected List<ShipWeapon> shipWeapons;
	public int getHull() {
		return hull;
	}
	public void setHull(int hull) {
		this.hull = hull;
	}
	public int getShields() {
		return shields;
	}
	public void setShields(int shields) {
		this.shields = shields;
	}
	public List<ShipWeapon> getShipWeapons() {
		return shipWeapons;
	}
	public void setShipWeapons(List<ShipWeapon> shipWeapons) {
		this.shipWeapons = shipWeapons;
	}
	
	public boolean isSunk(){
		boolean isSunk = false;
		if(hull <= 0){
			isSunk =  true;
		}
		return isSunk;
	}

}
