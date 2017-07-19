package cafe;

public class Cafe {
	
	public void Order(String orderName){
		System.out.println("손님께서 주문하신 음료는:"+orderName);
		System.out.println("잠시만 기다려주세요");
		process();
	}
	public void process(){
		try{
			Thread.sleep(5000);
			System.out.println("주문하신음료가 완성되었습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void serve(){
		System.out.println("손님 음료나왔습니다.");
	}

}
