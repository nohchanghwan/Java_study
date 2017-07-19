package tv.model.vo;

import tv.telecom.sk.SkTelecom;

public class LgTV extends SkTelecom implements TV{

	@Override
	public void powerON() {
		System.out.println("LgTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV powerOff");
	}

	@Override
	public void channel() {
		System.out.println("LgTV - SKTelecom");
	}

}
