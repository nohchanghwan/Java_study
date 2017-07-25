package board.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.command;
import ctrl.view.ModelAndView;

public class BoardInsert implements command {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ctrl insert");
		ModelAndView mv = new ModelAndView();
		mv.setPath("ok.jsp");
		mv.setSend(true);
		return mv;
	}
}
