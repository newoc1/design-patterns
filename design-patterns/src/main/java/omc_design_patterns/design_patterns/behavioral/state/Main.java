package omc_design_patterns.design_patterns.behavioral.state;

import omc_design_patterns.design_patterns.behavioral.state.colorful_blob_states.Blue;


public class Main {

	public static void main(String[] args) {
		ColorfulBlob blob = new ColorfulBlobImpl(new Blue());
		blob.poke();
		blob.poke();
		blob.poke();
		blob.poke();

	}

}
