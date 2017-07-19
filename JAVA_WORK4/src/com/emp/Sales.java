package com.emp;

public class Sales extends Employee implements Bonus {

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return (getSalary()*0.13);
	}

	@Override
	public void incentive(int pay) {
		this.setSalary((int) (this.getSalary()+(pay*1.2)));
	}
}
