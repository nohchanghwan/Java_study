import hip.model.vo.Boat;
import hip.model.vo.Cruise;
import hip.model.vo.Ship;

public class ShipMain {

	public static void main(String[] args) {

		Ship [] shiparr = new Ship[2];
		shiparr[0] = new Boat("Boat01",500);
		shiparr[0] = new Cruise("Cruise01",1000);
		
		System.out.println("shipName    fuelTank");
		System.out.println("--------------------");

		for(int i=0;i<shiparr.length;i++){
			System.out.println(shiparr[i].printShip());
		}
		
		shiparr[0].sail(10);shiparr[1].sail(10); 
		
		System.out.println("--------------------");
		for(int i=0;i<shiparr.length;i++){
			System.out.println(shiparr[i].printShip());
		}
		shiparr[0].refuel(50);shiparr[1].refuel(50); 
		System.out.println("--------------------");
		for(int i=0;i<shiparr.length;i++){
			System.out.println(shiparr[i].printShip());
		}
		
	}

}
