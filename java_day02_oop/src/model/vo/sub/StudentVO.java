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
		 * super�� �θ� ��Ī�ϴ� Ű����� 
		 * �θ��� �����ڷ� �Ű������� ȣ��
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