package cafe.model.vo;

public abstract class Beverage {
	
	private String  name;
	private int		price ; 
	
	public abstract void make();
	
	
	public Beverage() {
		super();
	}
	
	public Beverage(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
