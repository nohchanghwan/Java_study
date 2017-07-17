package model.vo.sub;
import model.vo.PersonVO;

public class TeacherVO extends PersonVO {
	private String 	subject;
	

	// 기본생성자
	
	public TeacherVO() {
		super();
	}

	public TeacherVO(String division, String name, int age, String adderss,String subject) {
		super(division, name, age, adderss);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String printTea(){
		return super.printPer()+"\t"+subject ;
	}

}
