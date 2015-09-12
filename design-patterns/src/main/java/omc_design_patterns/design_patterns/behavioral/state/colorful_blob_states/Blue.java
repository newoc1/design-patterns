package omc_design_patterns.design_patterns.behavioral.state.colorful_blob_states;

import omc_design_patterns.design_patterns.behavioral.state.ColorfulBlob;


public class Blue implements ColorfulBlobState {

	@Override
	public void poke(ColorfulBlob colorfulBlob) {
		System.out.println("You hear a warbled sound similar to sobbing.");
		colorfulBlob.changeState(new Green());
	}
}
