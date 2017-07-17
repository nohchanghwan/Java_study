import model.vo.sub.ManagerVO;
import model.vo.sub.StudentVO;
import model.vo.sub.TeacherVO;

public class HMSMain {

	public static void main(String[] args) {
	
		StudentVO stu = new StudentVO("학생","노창환",25,"인천","2012");
		System.out.println(stu.printStu());
	
		TeacherVO tea = new TeacherVO("학생","임정섭",25,"인천","자바");
		System.out.println(tea.printTea());

		ManagerVO emp = new ManagerVO("학생","방가은",25,"인천","매니저");
		System.out.println(emp.printEmp());

	}
}
