import board.model.sql.BoardDao;
import board.model.vo.BoardVO;

public class BoardMain {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		
		/*BoardVO board = new BoardVO();
		board.setTitle("�� �ʰ����ϴ����˰��ִ�");
		board.setContent("���ǿ��");
		board.setWriter("jslim");
		int flag = dao.insertRow(board);
		if(flag !=0){
			System.out.println("1 recode isert ok");
		}else{
			System.out.println("1 recode insert fail");
		}*/
		////////////////////////////////////////////////////////INSERT
		/*BoardVO board = new BoardVO();
		board.setTitle("����");
		board.setContent("����");
		board.setSeq(22);
		int flag = dao.updateRow(board);
		if(flag !=0){
			System.out.println("1 recode update ok");
		}else{
			System.out.println("1 recode update fail");
		}*/
		////////////////////////////////////////////////////////UPDATE		
		/*BoardVO board = new BoardVO();
		board.setSeq(23);
		int flag = dao.deleteRow(board);
		if(flag !=0){
			System.out.println("1 recode delete ok");
		}else{
			System.out.println("1 recode delete fail");
		}*/
		////////////////////////////////////////////////////////DELETE
		
		
	}

}