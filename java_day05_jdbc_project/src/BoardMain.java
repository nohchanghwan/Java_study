import board.model.sql.BoardDao;
import board.model.vo.BoardVO;

public class BoardMain {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		
		/*BoardVO board = new BoardVO();
		board.setTitle("난 너가뭐하는지알고있다");
		board.setContent("주의요망");
		board.setWriter("jslim");
		int flag = dao.insertRow(board);
		if(flag !=0){
			System.out.println("1 recode isert ok");
		}else{
			System.out.println("1 recode insert fail");
		}*/
		////////////////////////////////////////////////////////INSERT
		/*BoardVO board = new BoardVO();
		board.setTitle("수정");
		board.setContent("수정");
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
