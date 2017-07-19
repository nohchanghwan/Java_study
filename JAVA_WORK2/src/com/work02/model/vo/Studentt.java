package com.work02.model.vo;

import com.work02.model.vo.Human;

public class Studentt extends Human {

	private String number;
	private String major;
	
	public Studentt() {
		super();
	}

	public Studentt(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String printInformation(){
		return super.printInformatin() +"\t"+ number +"\t"+ major;
		
	}
	
	
}
