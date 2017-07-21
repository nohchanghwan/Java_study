import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import user.model.vo.UserVO;

public class Mapmain {

	public static void main(String[] args) {
		
		HashMap<String,UserVO> map = new HashMap<>();
		map.put("first",new UserVO());
		map.put("second",new UserVO());
		map.put("third",new UserVO());
		
		UserVO user = map.get("second");
		System.out.println(user);
		
		
		HashMap<String,ArrayList> map02 = new HashMap<String,ArrayList>();
		ArrayList<UserVO> list01 = new ArrayList<>();
		map02.put("list01",list01);
		ArrayList<UserVO> list02 = new ArrayList<>();
		map02.put("list02",list02);
		ArrayList<UserVO> list03 = new ArrayList<>();
		map02.put("list03",list03);
		
		ArrayList ary01 = map02.get("list01");
		Iterator<UserVO> ite = ary01.iterator();
		while(ite.hasNext()){
			
			System.out.println(ite.next());
		}
		
		
	}

}
