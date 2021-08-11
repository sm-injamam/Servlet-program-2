package com.apu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.graalvm.compiler.debug.DiagnosticsOutputDirectory;

/**
 * Servlet implementation class LearnNewServlet
 */
public class LearnNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LearnNewServlet() {

		super();
		// TODO Auto-generated constructor stub
		System.out.println("Hello");

	}

	
//	  public void service(ServletRequest req, ServletResponse resp) throws
//	  ServletException,IOException { // System.out.println("service"); //
////	  resp.getWriter().print("From java class");
////	  PrintWriter printWriter = resp.getWriter(); 
////	  printWriter.print("from LearnNewServlet java class");
//		  
//	  }
	 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().print("Do get method");
//		String name = request.getParameter("FName");
//		response.getWriter().print("Servlet by doGet; Your name is " + name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String name = req.getParameter("FName");
		  resp.getWriter().println("Servlet by; Your name is " + name);
		  
		  int i = Integer.parseInt(req.getParameter("num1"));
		  int j = Integer.parseInt(req.getParameter("num2"));
		  int k = i+j;
		  
		  PrintWriter out = resp.getWriter();
		  out.println("Sum is "+k);

	}

}
