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
		System.out.println("1.���θ� �׶��ε�");
		System.out.println("2.���� ������");
		System.out.println("3.������ �����Ѵ�");
		System.out.println("4.���Ѵ�");
		
	}

}
