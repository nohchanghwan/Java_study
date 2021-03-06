package ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.vo.UserVO;
import user.service.UserService;


@WebServlet("/login.do")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService service;

	public void init() {
		service = new UserService();
	}
	//init 은 메소드로 객체생성이 단한번 생성된다. 약속된메소드
	//////////////////////////////////////////////////////////
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Ctrl doPost");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	
	UserVO user = new UserVO();
	user.setId(id); user.setPwd(pwd);
	UserVO result = service.login(user);
	 	if(result != null){
	 		RequestDispatcher view = request.getRequestDispatcher("ok.jsp");
			view.forward(request, response);
		}else{
			RequestDispatcher view = request.getRequestDispatcher("error.jsp");
			view.forward(request, response);

		}
	}

}
