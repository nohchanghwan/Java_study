import model.vo.sub.ManagerVO;
import model.vo.sub.StudentVO;
import model.vo.sub.TeacherVO;

public class HMSMain {

	public static void main(String[] args) {
	
		StudentVO stu = new StudentVO("�л�","��âȯ",25,"��õ","2012");
		System.out.println(stu.printStu());
	
		TeacherVO tea = new TeacherVO("�л�","������",25,"��õ","�ڹ�");
		System.out.println(tea.printTea());

		ManagerVO emp = new ManagerVO("�л�","�氡��",25,"��õ","�Ŵ���");
		System.out.println(emp.printEmp());

	}
}