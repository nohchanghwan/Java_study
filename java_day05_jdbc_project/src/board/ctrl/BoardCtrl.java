package board.ctrl;

import java.util.ArrayList;

import board.model.vo.BoardVO;
import board.service.BoardService;

public class BoardCtrl {
	
	private BoardService service ;
	
	public BoardCtrl() {
		service = new BoardService();
	}
	//�䰡 ��Ʈ�ѷ��� ��û���߰� ��Ʈ�ѷ��� ���񽺷� ��û���ϱ����ؼ� �ν��Ͻ�����������
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