package board.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.BoardVO;
import board.service.BoardService;
import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardRead implements command {
	private BoardService service;
	public BoardRead(){
		service = new BoardService();
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Boardread ctrl");
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		BoardVO board = new BoardVO();
		board.setSeq(seq);
		
		BoardVO result = service.read(board);
		request.setAttribute("board", result);
	
		ModelAndView mv = new ModelAndView();
		mv.setPath("read.jsp");
		mv.setSend(true);    //request에 심었을때는 이렇게줘야함
		
		return mv ;
	}
}
