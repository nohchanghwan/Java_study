package cafe.model.vo;

public class Latte extends Beverage{

	public Latte() {
		super();
	}
	public Latte(String name, int price) {
		super(name, price);
	}
	@Override
	public void make() {
		System.out.println("1.원두를 그라인딩");
		System.out.println("2.샷을 내린다");
		System.out.println("3.우유를 스팀한다");
		System.out.println("4.희석한당");
		
	}

}
