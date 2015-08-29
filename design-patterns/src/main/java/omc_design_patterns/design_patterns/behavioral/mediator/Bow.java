package omc_design_patterns.design_patterns.behavioral.mediator;

public class Bow {
	private Mediator mediator;
	private boolean drawn;
	private int drawWeight;
	private int drawLength;
	private int snappiness;

	public Bow(int drawWeight, int drawLength, int snappiness){
		this.drawn = false;
		this.drawWeight = drawWeight;
		this.drawLength = drawLength;
		this.setSnappiness(snappiness);
	}
	
	public int loose(){
		int drawWeight = 0;
		if(!drawn){
			System.out.println("Not drawn.");
		}
		else{
			drawWeight = this.drawWeight;
		}
		return drawWeight;
	}
	
	public void nockAndDraw(Arrow arrow){
		drawn = true;
		arrow.setNocked(true);
	}
	
	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public int getDrawLength() {
		return drawLength;
	}
	public void setDrawLength(int drawLength) {
		this.drawLength = drawLength;
	}
	public int getSnappiness() {
		return snappiness;
	}
	public void setSnappiness(int snappiness) {
		this.snappiness = snappiness;
	}
}
