package user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ctrl.util.command;
import ctrl.view.ModelAndView;

public class LogoutCtrl implements command {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Logout Ctrl");
		HttpSession session =request.getSession(false);
		session.invalidate();
		ModelAndView mv = new ModelAndView();
		mv.setPath("main.do");
		mv.setSend(false);
		return mv;
	}
	
}
