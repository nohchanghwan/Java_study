
public class LoopExamMain {

	public static void main(String[] args) {
		
		int sum = LoopExam.evenSum(1,1000);
		System.out.println("¦������"+sum);
		LoopExam loop = new LoopExam();
		loop.leapYear(2017); //����Ÿ���� ����
		loop.leapYearLoop(1993, 2017);
		loop.gugudan();	
	}
}