package cn.itcast.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
	//执行Handler之后
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		

	}
	//进Handler之后，返回ModelAndView之前
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		

	}

	//进Handler之前
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
//		String url=request.getRequestURI();
//		
//		if(url.indexOf("login.action")>=0){
//			return true;
//		}
//		HttpSession session=request.getSession();
//		
//		String username=(String) session.getAttribute("username");
//		
//		if(username!=null){
//			return true;
//		}
//		//
//		response.sendRedirect("form.jsp");
		return true;
	}

}
