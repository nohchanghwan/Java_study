import tv.factory.TvFactory;
import tv.model.vo.TV;
import tv.telecom.Telecom;

public class TvUserMain {

	public static void main(String[] args) {
		
		TV tv = TvFactory.getBean("lg");
		tv.powerON(); tv.powerOff();
		
		// 같은내용이지만 메소드이름도다르고 객체타입도오픈되는 안좋은상황을 연출
		// 이것을 설계해보자 추상화!!
	
		((Telecom)tv).channel();
	}

}
