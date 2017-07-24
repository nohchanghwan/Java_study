package account;

import javax.security.auth.login.AccountException;


public class Account extends Exception{
	
	private String account ;
	private double balance ;
	private double interesRate ;
	Exception ex = new Exception();

	public Account() {
		super();
	}

	public Account(String account, double balance, double interesRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interesRate = interesRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInteresRate() {
		return interesRate*balance;
	}

	public void setInteresRate(double interesRate) {
		this.interesRate = interesRate;
	}
	
	public double calculateInterest(){
		
		return balance*interesRate;
	}
	public void deposit(double money) throws Exception{	
		if(money<0){
			throw new Exception("�Աݾ��� 0���� �۽��ϴ�");
		}else{
			setBalance(getBalance()+money);
		}
	}
	public void withdrow(double money) throws Exception{
		if((money > balance)||(money<0)){
			throw new Exception("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}else{
			setBalance(getBalance()-money);
			System.out.println("����ݾ�:"+balance);

		}
	}

	@Override
	public String toString() {
		return  account + "\t" + balance + "\t" + interesRate ;
	}
	
}