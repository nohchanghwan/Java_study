import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		ArrayList list = new ArrayList() ;
		//배열아닌것같지만 이건배열이다  + 데이터타입을 구분하지않고 다담는다.
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
