
public class Person {
	//전역변수는[접근제어자] [데이타 타입] [변수명] ;
	// public > protected > default > private  네가지 접근자
	// <--- 커짐-------가시성------- 작아짐-->
	// 적절하게 보호할것과 안할것 구분 => 대부분 변수는 private 메소드는 public 으로

	public char 	gender;
	public int 		age;
	public double 	height,weight;
	public String 	address;
	public boolean isMarrige;
	
	// 메소드는 [접근제어자] [리턴타입] [메서드명()]{
	// 			} 형태
	
	//현대년도와 생년월일은 입력받아서 age에 나이를 할당하고싶다

	public int calAge(int sysdate , int birth){
		age = sysdate - birth;
		return age;
	}

	/* 메소드는 4가지유형 중하나이다 
	1.인웃+아웃풋 
	2.아웃풋만
	3.인풋만
	4.둘다x
	+ 리턴값이없을경우 void 를 사용한다. 1,2번을 많이쓴다.
	*/
	
	public int div(double val1 , double val2){
		return (int)(val1/val2);   
	}

	public void printMsg(String msg){
		System.out.println(msg);
	}
	
	public int calOdd(){
		int result = 1+3+5+7+9;
		return result;
	}
}







