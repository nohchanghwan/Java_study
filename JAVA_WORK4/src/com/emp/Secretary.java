package com.emp;

public class Secretary extends Employee implements Bonus{

	
	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return (getSalary()*0.1);

	}

	@Override
	public void incentive(int pay) {
		  this.setSalary((int)(this.getSalary()+(pay*0.8)));
	}
	
	
}
