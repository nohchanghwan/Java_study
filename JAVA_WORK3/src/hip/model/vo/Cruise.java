package hip.model.vo;

public class Cruise extends Ship {

	public Cruise() {
		super();
	}

	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int dist) {
		this.setFuelTank(this.getFuelTank() - (dist*13));
	}

	@Override
	public void refuel(int fuel) {
		this.setFuelTank(this.getFuelTank() + (fuel*8));
	}

}
