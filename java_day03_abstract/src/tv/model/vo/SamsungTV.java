package tv.model.vo;

public class SamsungTV implements TV {
	//�������̽� ��ӹ����� extends �ƴϰ� implements

	@Override
	public void powerON() {
		System.out.println("SamsungTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOn");
		
	}	
}