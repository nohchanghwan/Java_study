import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		ArrayList list = new ArrayList() ;
		//�迭�ƴѰͰ����� �̰ǹ迭�̴�  + ������Ÿ���� ���������ʰ� �ٴ�´�.
		list.add("jslim");
		list.add(true);
		list.add(465);
		list.add('A');
		/*for(int i =0; i<list.size();i++){
		
			Object obj = list.get(i);
			System.out.println(obj);
		}*/
		
		for(Object obj : list){
			System.out.println(obj);
		}
		list.remove(2);
		for(Object obj : list){
			System.out.println(obj);
		}
	}

}