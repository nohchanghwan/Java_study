package main.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.command;
import ctrl.view.ModelAndView;

public class MainCtrl implements command{

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Main Ctrl");
		ModelAndView mv = new ModelAndView();
		mv.setPath("main.jsp");
		mv.setSend(true);
		return mv;
	}
}
