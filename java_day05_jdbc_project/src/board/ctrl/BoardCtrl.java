package board.ctrl;

import java.util.ArrayList;

import board.model.vo.BoardVO;
import board.service.BoardService;

public class BoardCtrl {
	
	private BoardService service ;
	
	public BoardCtrl() {
		service = new BoardService();
	}
	//뷰가 컨트롤러에 요청을했고 컨트롤러는 서비스로 요청을하기위해서 인스턴스를만들어보낸다
	public ArrayList<BoardVO> list(){
		return service.list();
	}
	
	public BoardVO read(BoardVO board){
		return service.read(board);
	}
	
	public ArrayList<BoardVO> search(BoardVO board){
		return service.search(board);
	}
}
