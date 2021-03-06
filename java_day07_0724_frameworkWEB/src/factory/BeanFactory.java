package factory;

import java.util.HashMap;

import board.ctrl.BoardDelete;
import board.ctrl.BoardForm;
import board.ctrl.BoardInsert;
import board.ctrl.BoardList;
import board.ctrl.BoardRead;
import board.ctrl.BoardUpdate;
import board.ctrl.BoardUpdateForm;
import ctrl.util.command;
import main.ctrl.MainCtrl;
import user.ctrl.LoginCtrl;
import user.ctrl.LogoutCtrl;
public class BeanFactory {
// 얘는 객체를 생성해서 관리하는역할
	private	HashMap<String, command> map ;
	private static BeanFactory instance ;
	private BeanFactory(){
		map = new HashMap<>();
		map.put("/java_day07_0724_frameworkWEB/insert.do", new BoardInsert());
		map.put("/java_day07_0724_frameworkWEB/list.do", new BoardList());
		map.put("/java_day07_0724_frameworkWEB/update.do", new BoardUpdate());		
		map.put("/java_day07_0724_frameworkWEB/main.do", new MainCtrl());
		map.put("/java_day07_0724_frameworkWEB/login.do", new LoginCtrl());
		map.put("/java_day07_0724_frameworkWEB/logout.do", new LogoutCtrl());
		map.put("/java_day07_0724_frameworkWEB/boardForm.do", new BoardForm());
		map.put("/java_day07_0724_frameworkWEB/read.do", new BoardRead());
		map.put("/java_day07_0724_frameworkWEB/delete.do", new BoardDelete());
		map.put("/java_day07_0724_frameworkWEB/updateForm.do", new BoardUpdateForm());
	
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
