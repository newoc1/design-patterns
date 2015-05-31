package omc_design_patterns.design_patterns.creational.singleton;

public class Gremlin {
	private boolean inPizzaHeaven;
	private boolean returnedToNetherworld;

	public Gremlin() {
		returnedToNetherworld = false;
	}

	public void eatPizza() {
		if (inPizzaHeaven ) {
			System.out.println("Gremlin is happily eating pizza.");
		}
		else if(!inPizzaHeaven && returnedToNetherworld){
			System.out.println("Already ate pizza master...");
		}
		else {
			askToGoThrough();
		}
	}

	public void returnToTheNetherworld() {
		if (inPizzaHeaven) {
			inPizzaHeaven = false;
			System.out.println("I'm stuffed! Time to go back to the netherworld.");
			GateKeeper.INSTANCE.openGate();
			returnedToNetherworld = true;
		}
	}

	public void queueForPizza() {
		GateKeeper.INSTANCE.queueGremlin(this);
	}

	private void askToGoThrough() {
		boolean canGoThrough = GateKeeper.INSTANCE.giveStatus();
		if (canGoThrough) {
			GateKeeper.INSTANCE.allowGremlinToPass(this);
		} else {
			System.out
					.println("Sorry Gremlin, another gremlin is currently eating pizza and the gate is closed.");
		}
	}

	public boolean isInPizzaHeaven() {
		return inPizzaHeaven;
	}

	public void setInPizzaHeaven(boolean inPizzaHeaven) {
		this.inPizzaHeaven = inPizzaHeaven;
	}

	public boolean isReturnedToNetherworld() {
		return returnedToNetherworld;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (inPizzaHeaven ? 1231 : 1237);
		result = prime * result + (returnedToNetherworld ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gremlin other = (Gremlin) obj;
		if (inPizzaHeaven != other.inPizzaHeaven)
			return false;
		if (returnedToNetherworld != other.returnedToNetherworld)
			return false;
		return true;
	}

}
