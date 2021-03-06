package front.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.command;
import ctrl.view.ModelAndView;
import factory.BeanFactory;


@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		requestPro(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request,response);
	}
	
	protected void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		System.out.println("client request:" + uri);
		BeanFactory factory = BeanFactory.getInstance();
		System.out.println("singleton adress:" + factory);
		
		command ctrl = factory.getBean(uri);
		ModelAndView mv = ctrl.execute(request, response);

		if(mv.isSend()){
			RequestDispatcher view = request.getRequestDispatcher(mv.getPath());
			view.forward(request, response);
		}else{
			response.sendRedirect(mv.getPath());
		}
	}

}
