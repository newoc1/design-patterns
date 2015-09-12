package omc_design_patterns.design_patterns.behavioral.state.colorful_blob_states;

import omc_design_patterns.design_patterns.behavioral.state.ColorfulBlob;


public class Yellow implements ColorfulBlobState {

	@Override
	public void poke(ColorfulBlob colorfulBlob) {
		System.out.println("The blob starts quivering violently.");
		colorfulBlob.changeState(new Red());
	}

}
