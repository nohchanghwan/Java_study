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
		System.out.println("1.���θ� �׶��ε�");
		System.out.println("2.���� ������");
		System.out.println("3.���� �񼮰���");
	}
	
}
