package tv.model.vo;

public class SamsungTV implements TV {
	//인터페이스 상속받을땐 extends 아니고 implements

	@Override
	public void powerON() {
		System.out.println("SamsungTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOn");
		
	}	
}
