
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Person per = new Person();  //인스턴스 생성 해당클래스 이름
		int result = per.calAge(2017, 1993);
		System.out.println(result);
		/////////////////////////////////////
		int result2 = per.div(6.2,4);
		System.out.println(result2);
		/////////////////////////////////////
		per.printMsg("asdasdasdasdsad");
		/////////////////////////////////////
		int resultOdd = per.calOdd();
		System.out.println(resultOdd);
		
	
	}
	
}
