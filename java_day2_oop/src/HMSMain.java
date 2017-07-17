import model.vo.PersonVO;
import model.vo.sub.ManagerVO;
import model.vo.sub.StudentVO;
import model.vo.sub.TeacherVO;

public class HMSMain {

	public static void main(String[] args) {
	
		PersonVO stu = new StudentVO("�л�","��âȯ",25,"��õ","2012");
		System.out.println(((StudentVO)stu).printStu());
		// ĳ���ý�ų���ִ�.
		PersonVO tea = new TeacherVO("�л�","������",25,"��õ","�ڹ�");
		System.out.println(((TeacherVO)tea).printTea());

		PersonVO emp = new ManagerVO("�л�","�氡��",25,"��õ","�Ŵ���");
		System.out.println( ((ManagerVO)emp).printEmp());
		
		/////////////////////////////////////////
		
		PersonVO [] perAry = new PersonVO[10];
		int idx = 0;
		perAry[idx++] = stu;
		perAry[idx++] = tea;
		perAry[idx++] = emp;
		
		System.out.println("���");
		for(int i=0;i<perAry.length;i++){
			PersonVO person = perAry[i];
			if(person == null){
				break;
			}
			System.out.println(person.printPer());
		}
		
		System.out.println("test");

		for(int i=0;i<perAry.length;i++){
			System.out.println(perAry[i].printPer());
		}
		
		
		
	}	
}
