import tv.factory.TvFactory;
import tv.model.vo.TV;
import tv.telecom.Telecom;

public class TvUserMain {

	public static void main(String[] args) {
		
		TV tv = TvFactory.getBean("lg");
		tv.powerON(); tv.powerOff();
		
		// �������������� �޼ҵ��̸����ٸ��� ��üŸ�Ե����µǴ� ��������Ȳ�� ����
		// �̰��� �����غ��� �߻�ȭ!!
	
		((Telecom)tv).channel();
	}

}
