import model.vo.PersonVO;
import model.vo.sub.ManagerVO;
import model.vo.sub.StudentVO;
import model.vo.sub.TeacherVO;

public class PolyMain {

	private static PersonVO [] 	perAry ;
	private static int			idx;
	
	public static void main(String[] args) {
	//�Ű�����,��ü �� ������	
		
		perAry = new PersonVO[10];
		//static �� non static �� �ν��Ͻ������� ������ ����x
		//�׷��� ���ξȿ� ����ų� �ٱ��� static�� ���̰ų�.
		
		private static StudentVO [] 	setAry ;	
		setAry = new StudentVO[10];

		
		StudentVO stu = new StudentVO("�л�","��âȯ",25,"��õ","2012");
		setAry(stu);
		TeacherVO tea = new TeacherVO("�л�","��âȯ",25,"��õ","2012");
		setAry(tea);
		ManagerVO emp = new ManagerVO("�л�","��âȯ",25,"��õ","2012");
		setAry(emp);
		
		printAry();
	
	public void setAry(StudentVO stu){
		
	}
	
	public void setAry(TeacherVO tea){
		
	}
	
	public void setAry(ManagerVO emp){
		
	}
	//�����̸� �׷��� Ÿ���� �޶� �����ε�

	}
}
