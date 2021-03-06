package board.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.BoardVO;
import board.service.BoardService;
import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardUpdate implements command{
	private BoardService service;
	public BoardUpdate(){
		service = new BoardService();
	}
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		System.out.println("update ctrl");
		request.setCharacterEncoding("EUC-KR"); // �̷����ѱ۾ȱ���

		int seq = Integer.parseInt(request.getParameter("seq"));
		String 	title = request.getParameter("title");
		String 	content = request.getParameter("content");
		
		BoardVO board = new BoardVO();
		board.setSeq(seq);
		board.setTitle(title);
		board.setContent(content);		
		int flag = service.update(board);
		request.setAttribute("board", flag);

		ModelAndView mv = new ModelAndView();
		if(flag!=0){
			mv.setPath("list.do");
			mv.setSend(false);
		}else{
		}
		return mv;
	}
}
