package omc_design_patterns.design_patterns.behavioral.state;

import omc_design_patterns.design_patterns.behavioral.state.colorful_blob_states.ColorfulBlobState;

public interface ColorfulBlob {
	void poke();
	
	void changeState(ColorfulBlobState colorfulBlobState);
}
