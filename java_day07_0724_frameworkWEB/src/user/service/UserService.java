package user.service;

import user.model.sql.UserDao;
import user.model.vo.UserVO;


public class UserService {
	
	
	private UserDao dao;
	
	public UserService(){
		dao = new UserDao();
	}
	
	public UserVO login(UserVO user){
		System.out.println("Service login");
		return dao.loginRow(user);
	}
}
