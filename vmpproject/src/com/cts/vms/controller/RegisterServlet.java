package com.cts.vms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.vms.BO.UserBo;
import com.cts.vms.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String id=request.getParameter("empid");
          String fname=request.getParameter("efirst");
          String lname=request.getParameter("elast");
          int age=Integer.parseInt(request.getParameter("empage"));
          String gender=request.getParameter("gender");
          String contact=request.getParameter("empcontact");
          String password=request.getParameter("password");
          String email=request.getParameter("empmail");
          String branch=request.getParameter("branch");
          
          User u=new User(id,fname,lname,age,gender,contact,email,password,branch);
          
          UserBo ub=new UserBo();
          boolean b=true;
          RequestDispatcher rd=null;
          try {
                 b=ub.insertUser(u);
                 System.out.println("Value inserted");
          } catch (Exception e) {
                 // TODO Auto-generated catch block
        	  rd=request.getRequestDispatcher("error.jsp"+e);
                // b=false;
                 e.printStackTrace();
          }
         
          if(b==true)
          {
        	  rd=request.getRequestDispatcher("success.jsp");
        	  rd.forward(request, response);
          }
          else
          {
        	  rd=request.getRequestDispatcher("error.jsp");
          }
          
	}

}
