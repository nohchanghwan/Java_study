import account.Account;

public class AccountMain {

	public static void main(String[] args) throws Exception {

		Account ac = new Account("441-0290-1203",500000,0.073);
		
		System.out.println("��������:"+ac.toString());
		try{
			ac.deposit(-10);
			}catch(Exception e){
					System.out.println(e.getMessage());
			}finally{
		}
		
		try{
			ac.withdrow(600000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
		 }	
		System.out.println("����"+ac.getInteresRate());
	}
}
