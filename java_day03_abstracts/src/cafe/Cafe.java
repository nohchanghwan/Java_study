package cafe;

import cafe.model.vo.Americano;
import cafe.model.vo.Beverage;
import cafe.model.vo.Latte;

public class Cafe {
	
	public void Order(String orderName){
		System.out.println("�մԲ��� �ֹ��Ͻ� �����:"+orderName);
		System.out.println("��ø� ��ٷ��ּ���");
		process(orderName);
		serve();
	}
		public  Beverage process(String orderName){
/*			try{
				Thread.sleep(5000);
				System.out.println("�ֹ��Ͻ����ᰡ �ϼ��Ǿ����ϴ�.");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
*/		Beverage drink = null;
		if(orderName.equals("�Ƹ޸�ī��")){
			drink = new Americano();
		}else if(orderName.equals("��")){
			drink = new Latte();
		}
		return drink;
		}
	
	public void serve(){
		System.out.println("�մ� ���ᳪ�Խ��ϴ�.");
	}

}
