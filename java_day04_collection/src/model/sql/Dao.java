package model.sql;

import java.util.ArrayList;

import user.model.vo.UserVO;

public class Dao {
	//Dao�� �����͸���±׸� VO�� ������� View �� �����ֱ�
	
	public ArrayList<UserVO> selectRow(){
		
		ArrayList<UserVO> list = new ArrayList<>();
		for(int i =0; i<10;i++){
			list.add(new UserVO("jslim","jsli","������"));
		}
		return list;
	}
}