package omc_design_patterns.design_patterns.behavioral.iterator;

public class LRUItem {
	private int level = 0;
	private int totalTimesUsed;
	private String color;
	
	public LRUItem(String color){
		this.color = color;
	}
	
	public void use(){
		System.out.println("Using LRUItem: "+color);
		decrementLevel();
		totalTimesUsed++;
	}
	public void incrementLevel(){
		level++;
	}
	
	public void decrementLevel(){
		if(level - 1 >= 0){
			level--;
		}
	}
	
	public int getLevel(){
		return level;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTotalTimesUsed() {
		return totalTimesUsed;
	}
}
