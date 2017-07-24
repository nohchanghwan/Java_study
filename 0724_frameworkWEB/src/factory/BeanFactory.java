package factory;

import java.util.HashMap;

import board.ctrl.BoardInsert;
import board.ctrl.BoardList;
import board.ctrl.BoardUpdate;
import ctrl.util.command;
import main.ctrl.MainCtrl;
import user.ctrl.LoginCtrl;
public class BeanFactory {
// 얘는 객체를 생성해서 관리하는역할
	private	HashMap<String, command> map ;
	private static BeanFactory instance ;
	private BeanFactory(){
		map = new HashMap<>();
		map.put("/0724_frameworkWEB/insert.do", new BoardInsert());
		map.put("/0724_frameworkWEB/list.do", new BoardList());
		map.put("/0724_frameworkWEB/update.do", new BoardUpdate());
		
		map.put("/0724_frameworkWEB/main.do", new MainCtrl());
		map.put("/0724_frameworkWEB/login.do", new LoginCtrl());

	}
	 
	public static BeanFactory getInstance(){
		if(instance == null){
			instance = new BeanFactory();
		} 
		return instance;
	}
	public command getBean(String uri){
		return map.get(uri);
	}
}
