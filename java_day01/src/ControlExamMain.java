
public class ControlExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlExam obj = new ControlExam();
		boolean flag = obj.isAdult(18);
		if(flag){
			System.out.println("성인인증이 되었습니다.");
		}else{
			System.out.println("집에가세요");
		}
		////////////////////////////////////////////////////
		
		String result = obj.grade(94);
		System.out.println("당신의 학점은" + result);
				
		
		
	}

}
