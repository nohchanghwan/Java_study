package model.vo;

public class PersonVO {
	//������ ���������ڴ� private����
	private String 	division ;
	private String 	name ;
	private int		age ;
	private String	adderss ;
	
	
	/* setter , getter ���콺������ + source + getter and setter
	 * this �� �ν��Ͻ� ������ ��Ÿ���� Ű�����̴�
	 * setter ���� ������ �������� ��ȿ���� Ȯ��
	 * ��ȿ�ϸ� �ٽ� ��ȯ�Ѵ�. ���ǹ�������
	 */
	
	public PersonVO() {
		super();
		// source + ����Ŭ����
	}
	
	//���������� ��������� �����̺� �׸���
	// �⺻�����ڿ� ������� �ʱ�ȭ�ϴ� ����Ȼ����� ������!
	
	
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
    	//Person������� ����Ʈ
    	return division +"\t"+name+"\t"+age+"\t"+adderss;
    }
    
	
	
}
