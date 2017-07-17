import model.vo.PersonVO;
import model.vo.sub.ManagerVO;
import model.vo.sub.StudentVO;
import model.vo.sub.TeacherVO;

public class PolyMain {

	private static PersonVO [] 	perAry ;
	private static int			idx;
	
	public static void main(String[] args) {
	//매개변수,객체 의 다형성	
		
		perAry = new PersonVO[10];
		//static 은 non static 의 인스턴스소유의 변수에 접근x
		//그래서 메인안에 만들거나 바깥에 static을 붙이거나.
		
		private static StudentVO [] 	setAry ;	
		setAry = new StudentVO[10];

		
		StudentVO stu = new StudentVO("학생","노창환",25,"인천","2012");
		setAry(stu);
		TeacherVO tea = new TeacherVO("학생","노창환",25,"인천","2012");
		setAry(tea);
		ManagerVO emp = new ManagerVO("학생","노창환",25,"인천","2012");
		setAry(emp);
		
		printAry();
	
	public void setAry(StudentVO stu){
		
	}
	
	public void setAry(TeacherVO tea){
		
	}
	
	public void setAry(ManagerVO emp){
		
	}
	//같은이름 그러나 타입이 달라서 오버로딩

	}
}
