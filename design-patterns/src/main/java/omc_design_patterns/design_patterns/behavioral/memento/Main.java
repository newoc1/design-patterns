package omc_design_patterns.design_patterns.behavioral.memento;

public class Main {

	public static void main(String[] args) {
		SpacetimeItemManager progenitor = new SpacetimeItemManager();
		Inventory beginningInventory = new Inventory();
		progenitor.setInventoryMemento(new InventoryMemento(beginningInventory));
		TimeTraveler timeTraveler = new TimeTraveler(progenitor, beginningInventory);
		int yearsToSearchForRelics = 3; // The number of years left before an
										// astronomical object hits the planet
										// and destroys all life
		int yearsToFatigueOfTimeTraveler = 60; // The number of years the time
												// traveler will search for
												// relics before giving up
		int totalNumberOfYearsExperienced = 0;
		boolean allRelicsFound = false;
		while (!allRelicsFound
				&& totalNumberOfYearsExperienced < yearsToFatigueOfTimeTraveler) {
			for(int i = 0 ; i < yearsToSearchForRelics && !allRelicsFound; i++){
				timeTraveler.searchForRelics();
				totalNumberOfYearsExperienced++;
				allRelicsFound = timeTraveler.checkRelics();
				timeTraveler.saveInventory();
			}
			timeTraveler.goBackInTime(yearsToSearchForRelics);
			
		}
		if(allRelicsFound){
			System.out.println("And the hero lived a long time after.");
		}
		else{
			System.out.println("The hero died of old age and the world was doomed in all realities.");
		}
	}
}
