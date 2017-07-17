
public class GreetingMain {

	
	//변수선언가능(전역,글로벌,멤버변수)
	//멤버변수는 선언만해도 자동 default가되어서 초기화필요없음)
	public static void main(String[] args) {		
	//메인메소드가있으면 실행이가능 (없으면 컴파일만가능)
	//변수선언가능(지역,로컬변수 는 자동 default 안됨 = 선언과동시에 초기화 initialize 필요)
		System.out.println("처음 만나는 자바세상");  //'sysout' + ctrl + spacebar 
		//실행은 ctrl + F11
		
		
		int age = 20 ;
		System.out.println(age);
		double weight = 64.9;
		System.out.println(weight);
		char gender ='M'; // 
		System.out.println(gender);
		boolean isMarrigae = true; 
		System.out.println(isMarrigae);
		String name = "노창환";
		System.out.println(name);
		int sum =30;
		int avg = sum/3;
		System.out.println(avg);
		char charValue = 'A';
		System.out.println(charValue);
		int intValue = 'A';
		System.out.println(intValue);
		
		
		//묵시적 형변환 -> 프로모션 , 강제적형변환 -> Casting 캐스팅
		// byte -> short -> int -> long --> float -> double
		int	castingValue = 65;
		char charCasting = (char)castingValue ;
		System.out.println(charCasting);
		
		
		//연산자
		
 	
	}
}
