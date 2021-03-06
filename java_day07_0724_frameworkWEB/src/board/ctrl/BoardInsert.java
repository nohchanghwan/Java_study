package board.ctrl;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.BoardVO;
import board.service.BoardService;
import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardInsert implements command {
	
	private BoardService service;
	
	public BoardInsert(){
		service = new BoardService();
	}
	////////////////////////////////////////
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ctrl insert");
		request.setCharacterEncoding("EUC-KR"); // �̷����ѱ۾ȱ���
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		int flag = service.insert(board);
		ModelAndView mv = new ModelAndView();
		if(flag !=0 ){
			mv.setPath("list.do");
			mv.setSend(false);
		}
		return mv ;
	}
}
