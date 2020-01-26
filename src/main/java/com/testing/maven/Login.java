package com.testing.maven;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=uft-8");
		String uservalue=request.getParameter("User");
		String pwdvalue=request.getParameter("pwd");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("我的项目").append(uservalue+pwdvalue);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String userpost=request.getParameter("User");
		String pwdpost=request.getParameter("pwd");
		String loginMsg=" ";
		if((new String("dw")).equals(userpost)&&(new String("123456")).equals(pwdpost)) {
//			loginMsg="恭喜您登录成功";
			loginMsg= "{\"statusCode\":\"1\",\"msg\":\"恭喜您登录成功\"}";
		}
		else {
//			loginMsg="登录失败，请重新登录";
			loginMsg= "{\"statusCode\":\"0\",\"msg\":\"登录失败，请重新登录\"}";
		}
//		response.getWriter().append("调post方法").append(userpost+pwdpost).append("登录结果是："+loginMsg);
		response.getWriter().append(loginMsg);
	}

}
