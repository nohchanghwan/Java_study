package ctrl.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.view.ModelAndView;

public interface command {

	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	//인터페이스는 내용물이없어야됨
	
}
