package model.vo;

public class PersonVO {
	//변수의 접근제어자는 private으로
	private String 	division ;
	private String 	name ;
	private int		age ;
	private String	adderss ;
	
	
	/* setter , getter 마우스오른쪽 + source + getter and setter
	 * this 는 인스턴스 소유를 나타내는 키워드이다
	 * setter 에서 들어오는 데이터의 유효성을 확인
	 * 유효하면 다시 반환한다. 조건문을통해
	 */
	
	public PersonVO() {
		super();
		// source + 슈퍼클래스
	}
	
	//습관적으로 멤버변수는 프라이빗 그리고
	// 기본생성자와 멤버변수 초기화하는 스페셜생성자 만들어라!
	
	
	public PersonVO(String division, String name, int age, String adderss) {
		super();
		this.division = division;
		this.name = name;
		this.age = age;
		this.adderss = adderss;
	}


	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	
    public String printPer(){
    	//Person구성요소 프린트
    	return division +"\t"+name+"\t"+age+"\t"+adderss;
    }
    
	
	
}
