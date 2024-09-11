package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.MuConnection;
import database.MuOperation;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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
		
		String username=request.getParameter("username");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("dropdown");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String password=request.getParameter("password");
		
		System.out.println(username);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(email);
		System.out.println(phoneno);
		System.out.println(password);
		
		MuConnection db=new MuConnection();
		MuOperation dbo = new MuOperation(db.getConnection());
		
		try {
			dbo.createTable();
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			dbo.insertData(username,dob,gender,email,phoneno,password);
			response.sendRedirect("RegPage.jsp");
		}catch (Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}
}


