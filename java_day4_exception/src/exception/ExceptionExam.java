package exception;

import exception.util.UserException;

public class ExceptionExam {
	
	public void runtimeE(){
		String [] ary = {"A","B","C","D"};
		try{
			for(int i =0;i<=ary.length;i++){
				System.out.println(ary[i]);
				//���⼭���ܹ߰�Ȯ��
		
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("���ܹ߻���� ���̼���");
		}
	}
	
	
	
	public void invokeE(int amount) throws UserException{
		//throws �� �����°�
		int balance = 5000 ;
		if(amount > balance){
			throw new UserException("�ܾ��̺����մϴ�");
			//throw �� ���ܸ������� �Ͷ߸��°�
		}
	}
	
	
	
}
