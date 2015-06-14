package omc_design_patterns.design_patterns.structural.bridge.location;

public class LocationImpl implements Location {
	private String name;
	private int x;
	private int y;
	private int z;
	
	public LocationImpl(String name, int x, int y, int z){
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public int getXCoordinate() {
		return x;
	}

	@Override
	public int getYCoordinate() {
		return y;
	}

	@Override
	public int getZCoordinate(){
		return z;
	}
	@Override
	public int distanceToLocation(Location location) {
		return (int) Math.sqrt(Math.pow(location.getXCoordinate(),2) + Math.pow(location.getYCoordinate(),2) + Math.pow(location.getZCoordinate(),2));
	}

	@Override
	public String getName() {
		return name;
	}

}
