package board.ctrl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.BoardVO;
import board.service.BoardService;
import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardList implements command{
	private BoardService service;
	public BoardList(){
		service = new BoardService();
	}
	/////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ctrl list");
		ModelAndView mv = new ModelAndView();
		
		ArrayList<BoardVO> list = service.list();
		
		request.setAttribute("lists",list);
		mv.setPath("list.jsp");
		mv.setSend(true);
		return mv;
	}
}
