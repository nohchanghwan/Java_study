package exception;

import exception.util.UserException;

public class ExceptionExam {
	
	public void runtimeE(){
		String [] ary = {"A","B","C","D"};
		try{
			for(int i =0;i<=ary.length;i++){
				System.out.println(ary[i]);
				//여기서예외발견확인
		
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("예외발생상관 없이수행");
		}
	}
	
	
	
	public void invokeE(int amount) throws UserException{
		//throws 는 던지는거
		int balance = 5000 ;
		if(amount > balance){
			throw new UserException("잔액이부족합니다");
			//throw 는 예외를강제로 터뜨리는거
		}
	}
	
	
	
}
