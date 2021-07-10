package cybersoft.java12.crmapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java12.crmapp.util.JspConst;
import cybersoft.java12.crmapp.util.UrlConst;

@WebServlet(name = "userServlet", urlPatterns = {
		UrlConst.USER_DASHBOARD,
		UrlConst.USER_PROFILE,
		UrlConst.USER_ADD,
		UrlConst.USER_UPDATE,
		UrlConst.USER_DELETE
})
public class UserServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch(req.getServletPath()) {
		case UrlConst.USER_DASHBOARD:
			getUserDashboard(req,resp);
			break;
		case UrlConst.USER_PROFILE:
			getUserProfile(req,resp);
			break;
		case UrlConst.USER_ADD:
			getUserAdd(req,resp);
			break;
		case UrlConst.USER_UPDATE:
			getUserUpdate(req,resp);
			break;
		case UrlConst.USER_DELETE:
			getUserDelete(req,resp);
			break;
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch(req.getServletPath()) {
		case UrlConst.USER_DASHBOARD:
			
			break;
		case UrlConst.USER_PROFILE:
			
			break;
		case UrlConst.USER_ADD:
			postUserAdd(req,resp);
			break;
		case UrlConst.USER_UPDATE:
			
			break;
		case UrlConst.USER_DELETE:
			
			break;
		}
	}
	
	private void getUserDelete(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void getUserUpdate(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void getUserAdd(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void getUserProfile(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

	private void getUserDashboard(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(JspConst.USER_DASHBOARD)
			.forward(req, resp);
	}

	private void postUserAdd(HttpServletRequest req, HttpServletResponse resp) {
		
	}
}
