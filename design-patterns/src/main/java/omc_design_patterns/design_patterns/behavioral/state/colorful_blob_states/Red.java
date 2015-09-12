package omc_design_patterns.design_patterns.behavioral.state.colorful_blob_states;

import omc_design_patterns.design_patterns.behavioral.state.ColorfulBlob;


public class Red implements ColorfulBlobState {


	@Override
	public void poke(ColorfulBlob colorfulBlob) {
		System.out.println("Colorful Blob emits a powerful roar and attacks you!");
	}


}
