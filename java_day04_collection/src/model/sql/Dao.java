package model.sql;

import java.util.ArrayList;

import user.model.vo.UserVO;

public class Dao {
	//Dao는 데이터를담는그릇 VO는 로직담당 View 는 보여주기
	
	public ArrayList<UserVO> selectRow(){
		
		ArrayList<UserVO> list = new ArrayList<>();
		for(int i =0; i<10;i++){
			list.add(new UserVO("jslim","jsli","임정섭"));
		}
		return list;
	}
}
