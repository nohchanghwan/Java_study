
public class Season {
	public static final int SPRING	= 1; // final ���̸� ������ȴ�.
	public static final int SUMMER	= 2; // static ���̸� Ŭ���������Ǻ������ȴ�(�����ν��ͽ��������ƴ�)
	public static final int FALL	= 3; // �ΰ��� ���̺��̸� ����̸鼭 Ŭ������ ���� ����������ٲܼ�X 
	public static final int WINTER	= 4; // �̶��� �빮�ڷ� �����ؾߵȴ�.
	//Ŭ������ �������Ǹ� �ν��Ͻ��������� [Ŭ������.������] ���� �����ؼ� ��밡��


	public void checkSeason(int season){
		// byte short int char String Enum
		switch(season){
			case 1:
				System.out.println("spring");
				break;
			case 2:
				System.out.println("summer");
				break;
			case 3:
				System.out.println("fall");
				break;
			case 4:
				System.out.println("winter");
				break;
			default :
				System.out.println("�������´� �����Է¹ٶ�");
				
				
		}
	}

}

