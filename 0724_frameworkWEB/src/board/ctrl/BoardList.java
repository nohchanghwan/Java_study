package board.ctrl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.vo.BoardVO;
import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardList implements command{
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ctrl list");
		ModelAndView mv = new ModelAndView();
		ArrayList<BoardVO> list = new ArrayList<>();
		
		list.add(new BoardVO(1,"������","��","�����̰�","170724",0));
		list.add(new BoardVO(2,"����","�漺","������","170511",0));
		
		/*HttpSession session = request.getSession();
		session.setAttribute("lists",list);*/
		
		
		mv.setPath("list.jsp");
		mv.setSend(true);
		return mv;
	}
}
