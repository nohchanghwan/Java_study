package model.vo.sub;

import model.vo.PersonVO; //ctrl + shift + O 

public class StudentVO extends PersonVO{
	private	String	stuID ;

	
	
	public StudentVO() {
		super();
	}
	
	public StudentVO(String division, String name, int age, String adderss, String stuID) {
		super(division, name, age, adderss);
		this.stuID = stuID;
		
		/*
		 * super는 부모를 지칭하는 키워드로 
		 * 부모의 생성자로 매개변수를 호출
		 */
	}

	public String getStuID() {
		return stuID;
	}

	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	
	public String printStu(){
	    return super.printPer()+"\t"+this.getStuID();
	    }
 
	@Override	
	public String printPer(){
	    return super.printPer()+"\t"+this.getStuID();
	    }

}
