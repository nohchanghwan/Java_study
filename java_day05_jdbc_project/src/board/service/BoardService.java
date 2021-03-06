package board.service;

import java.util.ArrayList;

import board.model.sql.BoardDao;
import board.model.vo.BoardVO;

public class BoardService {
	
	private BoardDao dao ;
	
	public BoardService(){
		dao = new BoardDao();
	}
	public int insert(BoardVO board){
		return dao.insertRow(board);
	}
	public int update(BoardVO board){ 
		return dao.updateRow(board);
	}
	public int delete(BoardVO board){
		return dao.deleteRow(board);
	}
	public ArrayList<BoardVO> list(){
		
		return dao.listRow();
	}
	public BoardVO read(BoardVO board){
		
		return dao.readRow(board);
	}
	public ArrayList<BoardVO> search(BoardVO board) {
		return  dao.searchRow(board);

	}
}
