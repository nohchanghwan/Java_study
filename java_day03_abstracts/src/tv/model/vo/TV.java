package tv.model.vo;

public interface TV {
	//인터페이스의 구성은 상수와 추상메소드로이루어져있다(보편적으로 추상메소드만씀)
	public void powerON(); // 추상메소드는 {}  하는거아니다 + abstract 붙여도되지만 인터페이스에선 생략가능
	public void powerOff(); 
}
