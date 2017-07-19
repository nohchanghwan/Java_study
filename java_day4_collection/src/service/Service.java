package service;

import java.util.ArrayList;

import model.sql.Dao;
import user.model.vo.UserVO;

public class Service {
	private Dao dao;
	
	public Service(){
		dao = new Dao();
	}
	public ArrayList<UserVO> select(){
		return dao.selectRow();
	}
}
