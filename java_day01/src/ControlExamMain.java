
public class ControlExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlExam obj = new ControlExam();
		boolean flag = obj.isAdult(18);
		if(flag){
			System.out.println("���������� �Ǿ����ϴ�.");
		}else{
			System.out.println("����������");
		}
		////////////////////////////////////////////////////
		
		String result = obj.grade(94);
		System.out.println("����� ������" + result);
				
		
		
	}

}