
public class Person {
	//����������[����������] [����Ÿ Ÿ��] [������] ;
	// public > protected > default > private  �װ��� ������
	// <--- Ŀ��-------���ü�------- �۾���-->
	// �����ϰ� ��ȣ�ҰͰ� ���Ұ� ���� => ��κ� ������ private �޼ҵ�� public ����

	public char 	gender;
	public int 		age;
	public double 	height,weight;
	public String 	address;
	public boolean isMarrige;
	
	// �޼ҵ�� [����������] [����Ÿ��] [�޼����()]{
	// 			} ����
	
	//����⵵�� ��������� �Է¹޾Ƽ� age�� ���̸� �Ҵ��ϰ��ʹ�

	public int calAge(int sysdate , int birth){
		age = sysdate - birth;
		return age;
	}

	/* �޼ҵ�� 4�������� ���ϳ��̴� 
	1.�ο�+�ƿ�ǲ 
	2.�ƿ�ǲ��
	3.��ǲ��
	4.�Ѵ�x
	+ ���ϰ��̾������ void �� ����Ѵ�. 1,2���� ���̾���.
	*/
	
	public int div(double val1 , double val2){
		return (int)(val1/val2);   
	}

	public void printMsg(String msg){
		System.out.println(msg);
	}
	
	public int calOdd(){
		int result = 1+3+5+7+9;
		return result;
	}
}






