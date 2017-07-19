package view;

import java.util.ArrayList;
import java.util.Iterator;

import service.Service;
import user.model.vo.UserVO;

public class View {
	
	private Service service ;
	public View(){
		
		service = new Service();
	}
	
	public void printAll(){
		ArrayList<UserVO> list = service.select();
		
		Iterator<UserVO> ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
