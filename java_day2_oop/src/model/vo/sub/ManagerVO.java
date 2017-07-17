package model.vo.sub;

import model.vo.PersonVO;

public class ManagerVO extends PersonVO{
	private String	dept;
	
	
	public ManagerVO() {
		super();
	}
	public ManagerVO(String division, String name, int age, String adderss, String dept) {
		super(division, name, age, adderss);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String printEmp(){
		return super.printPer()+"\t"+dept ;
	}
}
