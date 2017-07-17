
public class Season {
	public static final int SPRING	= 1; // final 붙이면 상수가된다.
	public static final int SUMMER	= 2; // static 붙이면 클래스소유의변수가된다(기존인스터스소유가아닌)
	public static final int FALL	= 3; // 두개를 같이붙이면 상수이면서 클래스의 소유 어느누구도바꿀수X 
	public static final int WINTER	= 4; // 이때는 대문자로 선언해야된다.
	//클래스의 소유가되면 인스턴스생성없이 [클래스명.변수명] 으로 선언해서 사용가능


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
				System.out.println("계절에맞는 숫자입력바람");
				
				
		}
	}

}

