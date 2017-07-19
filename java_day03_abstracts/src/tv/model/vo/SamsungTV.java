package tv.model.vo;

import tv.telecom.sk.SkTelecom;

public class SamsungTV extends SkTelecom implements TV{

	@Override
	public void powerON() {
		System.out.println("SamsungTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	@Override
	public void channel() {
		System.out.println("Samsung - SKTelecom");		
	}

}
