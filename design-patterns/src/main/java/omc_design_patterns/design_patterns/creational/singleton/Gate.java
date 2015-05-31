package omc_design_patterns.design_patterns.creational.singleton;

public class Gate {
	private boolean gateIsOpen;
	public Gate(){
		gateIsOpen = true;
	}
	public void open(){
		if(!gateIsOpen){
			System.out.println("Gate is not open. Gatekeeper is opening the gate.");
			gateIsOpen = true;
		}
		else{
			System.out.println("Gate is already open. Go right on through.");
		}
	}
	
	public void close(){
		if(!gateIsOpen){
			System.out.println("Gate is already closed.");
		}
		else{
			System.out.println("Gate is open. Closing.");
			gateIsOpen = false;
		}
	}

	public boolean isGateIsOpen() {
		return gateIsOpen;
	}

}
