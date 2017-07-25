package board.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.BoardVO;
import board.service.BoardService;
import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardUpdateForm implements command{
	private BoardService service;
	public BoardUpdateForm(){
		service = new BoardService();
	}
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("BoardUpdateForm ctrl");
		int seq = Integer.parseInt(request.getParameter("seq"));

		BoardVO board = new BoardVO();
		board.setSeq(seq);
		
		BoardVO result = service.read(board);
		request.setAttribute("board", result);
		
		ModelAndView mv = new ModelAndView();
		mv.setPath("update.jsp");
		mv.setSend(true);
		return mv;
	}

}
