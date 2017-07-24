package user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ctrl.util.command;
import ctrl.view.ModelAndView;
import user.model.vo.UserVO;
import user.service.UserService;

public class LoginCtrl implements command {

	private UserService service;
	public LoginCtrl(){
		service = new UserService();
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Ctrl login");
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		UserVO user = new UserVO();
		user.setId(id);user.setPwd(pwd);
		UserVO result = service.login(user);
		ModelAndView mv = new ModelAndView();
		if(result != null){
			mv.setPath("main.jsp"); mv.setSend(true);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", result);
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", result);

		}
		
		
		return mv;
	}
	
}
