import tv.model.vo.LgTV;
import tv.model.vo.SamsungTV;

public class TvUserMain {

	public static void main(String[] args) {

		SamsungTV tv = new SamsungTV();
		
		LgTV tv = new LgTV();
		tv.turnOn(); tv.turnOff();
		
		
		// 같은내용이지만 메소드이름도다르고 객체타입도오픈되는 안좋은상황을 연출
		// 이것을 설계해보자 추상화!!
	}

}
