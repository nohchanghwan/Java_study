import model.vo.PersonVO;
import model.vo.sub.ManagerVO;
import model.vo.sub.StudentVO;
import model.vo.sub.TeacherVO;

public class HMSMain {

	public static void main(String[] args) {
	
		PersonVO stu = new StudentVO("학생","노창환",25,"인천","2012");
		System.out.println(((StudentVO)stu).printStu());
		// 캐스팅시킬수있다.
		PersonVO tea = new TeacherVO("학생","임정섭",25,"인천","자바");
		System.out.println(((TeacherVO)tea).printTea());

		PersonVO emp = new ManagerVO("학생","방가은",25,"인천","매니저");
		System.out.println( ((ManagerVO)emp).printEmp());
		
		/////////////////////////////////////////
		
		PersonVO [] perAry = new PersonVO[10];
		int idx = 0;
		perAry[idx++] = stu;
		perAry[idx++] = tea;
		perAry[idx++] = emp;
		
		System.out.println("출력");
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
