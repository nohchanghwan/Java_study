package ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test.do")
public class TestServlet extends HttpServlet {
	//모든서블릿은 Http서블릿을 상속받는다.
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet doget");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(id+pwd);
		
		//response.sendRedirect("greeting.html");
		RequestDispatcher view = request.getRequestDispatcher("greeting.html");
		view.forward(request, response);
		System.out.println("assadas");
	}
}