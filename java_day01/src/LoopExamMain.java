
public class LoopExamMain {

	public static void main(String[] args) {
		
		int sum = LoopExam.evenSum(1,1000);
		System.out.println("짝수의합"+sum);
		LoopExam loop = new LoopExam();
		loop.leapYear(2017); //리턴타입이 없다
		loop.leapYearLoop(1993, 2017);
		loop.gugudan();	
	}
}
