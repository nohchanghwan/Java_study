package tv.model.vo;

public class LgTV implements TV {

	@Override
	public void powerON() {
		System.out.println("LgTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV powerOff");
	}

}
