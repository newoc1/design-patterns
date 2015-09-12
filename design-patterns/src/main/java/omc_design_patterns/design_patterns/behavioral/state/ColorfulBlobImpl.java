package omc_design_patterns.design_patterns.behavioral.state;

import omc_design_patterns.design_patterns.behavioral.state.colorful_blob_states.ColorfulBlobState;

public class ColorfulBlobImpl implements ColorfulBlob {
	private ColorfulBlobState colorfulBlobState;

	public ColorfulBlobImpl(ColorfulBlobState colorfulBlobState){
		this.colorfulBlobState = colorfulBlobState;
	}
	public ColorfulBlobState getColorfulBlobState() {
		return colorfulBlobState;
	}
	
	public void poke(){
		colorfulBlobState.poke(this);
	}
	
	@Override
	public void changeState(ColorfulBlobState colorfulBlobState) {
		this.colorfulBlobState = colorfulBlobState;
		
	}
}
