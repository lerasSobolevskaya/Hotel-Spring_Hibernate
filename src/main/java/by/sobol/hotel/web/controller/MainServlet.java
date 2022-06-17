//package by.sobol.hotel.web.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import by.sobol.hotel.web.action.ActionManagerContext;
//import by.sobol.hotel.web.action.BaseAction;
//
//import static by.sobol.hotel.web.util.WebControllerConstatntPool.REQUEST_PARAM_AUTHENTICATION;
//
///**
// * 
// * @author Sobolevskaya
// *
// */
//public class MainServlet extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	public MainServlet() {
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		try {
//			processRequest(request, response);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		try {
//			processRequest(request, response);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, ServletException, IOException {
//
//		ServletContext servletContext = request.getServletContext();
//		WebApplicationContext webApplicationContext = WebApplicationContextUtils
//				.getWebApplicationContext(servletContext);
//		String action = request.getParameter(REQUEST_PARAM_AUTHENTICATION);
//		BaseAction baseAction = ActionManagerContext.getAction(action, webApplicationContext);
//		if (action != null) {
//			String page = baseAction.executeAction(request);
//			request.getRequestDispatcher(page).forward(request, response);
//		} else {
//			response.getWriter().println("Incorrect Action!");
//		}
//	}
//}
