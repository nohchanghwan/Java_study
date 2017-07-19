package hip.model.vo;

public class Boat extends Ship{

	public Boat() {
		super();
	}
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}
	@Override
	public void sail(int dist) {
		this.setFuelTank(this.getFuelTank() - (dist*10));
		
	}
	@Override
	public void refuel(int fuel) {
		this.setFuelTank(this.getFuelTank() - (fuel*13));

	}
	

}
