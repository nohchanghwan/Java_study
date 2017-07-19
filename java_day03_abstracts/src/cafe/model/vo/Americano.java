package cafe.model.vo;

public class Americano extends Beverage{

	public Americano() {
		super();
	}

	public Americano(String name, int price) {
		super(name, price);
	}

	@Override
	public void make() {
		System.out.println("1.원두를 그라인딩");
		System.out.println("2.샷을 내린다");
		System.out.println("3.물과 희석간다");
	}
	
}
