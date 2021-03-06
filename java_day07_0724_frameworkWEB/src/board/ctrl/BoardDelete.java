package board.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.BoardVO;
import board.service.BoardService;
import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardDelete implements command{
	private BoardService service;
	public BoardDelete(){
		service = new BoardService();
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("BoardDelete ctrl");
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardVO board = new BoardVO();
		board.setSeq(seq);
		
		int flag = service.delete(board);
		
		ModelAndView mv = new ModelAndView();
		if(flag!=0){
		mv.setPath("list.do");
		mv.setSend(false);
		}else{
			
		}
		
		return mv;

	}

}





