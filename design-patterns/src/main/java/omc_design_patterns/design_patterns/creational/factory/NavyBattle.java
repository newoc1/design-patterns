package omc_design_patterns.design_patterns.creational.factory;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import omc_design_patterns.design_patterns.creational.factory.ship_factories.Shipyard;
import omc_design_patterns.design_patterns.creational.factory.ships.Ship;

public class NavyBattle {

	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(".\\src\\main\\resources\\output.txt"))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Team 1
		List<Ship> team1 = new ArrayList<>();
		//Team2
		List<Ship> team2 = new ArrayList<>();
		List<List<Ship>> teams = new ArrayList<>();
		teams.add(team1);
		teams.add(team2);
		for(List<Ship> team:teams){
			team.add(Shipyard.capitalShipFactory.createShip());
			for(int i = 0; i <10; i ++){
				team.add(Shipyard.frigateFactory.createShip());
				team.add(Shipyard.corvetteFactory.createShip());
				if( i % 2 == 0){
					team.add(Shipyard.cruiserFactory.createShip());
					team.add(Shipyard.destroyerFactory.createShip());
				}
			}
		}
		System.out.println("****Before");
		System.out.println("team 1 size: "+team1.size());
		System.out.println("team 2 size: "+team2.size());
		Random rand = new Random();
		while(team1.size() > 0 && team2.size() >0){
			int team1Player = rand.nextInt(team1.size());
			Ship team1Ship = team1.get(team1Player);
			int team2Player = rand.nextInt(team2.size());
			Ship team2Ship = team2.get(team2Player);
			team1Ship.fireAt(team2Ship);
			team2Ship.fireAt(team1Ship);
			if(team1Ship.isSunk()){
				team1.remove(team1Ship);
			}
			if(team2Ship.isSunk()){
				team2.remove(team2Ship);
			}
			int directionNum = rand.nextInt(3);
			String direction;
			if(directionNum == 0){
				direction = "South";
			}
			else if(directionNum == 1){
				direction = "West";
			}
			else if(directionNum == 2){
				direction = "North";
			}
			else{
				direction = "East";
			}
			if(!team1Ship.isSunk()){
			team1Ship.sail(direction);
			}
			if(!team2Ship.isSunk()){
			team2Ship.sail(direction);
			}
		}
		System.out.println("****After");
		System.out.println("team 1 size: "+team1.size());
		System.out.println("team 2 size: "+team2.size());

	}

}
