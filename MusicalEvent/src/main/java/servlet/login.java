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
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		String password=request.getParameter("password");
		
		System.out.println("Received parameters");
		System.out.println("Username:"+username);
		System.out.println("Password"+password);
		
		 if (username == null || password == null) {
	            response.getWriter().append("Email or password is missing");
	            return;
	        }
		
		MuConnection db=new MuConnection();
		MuOperation dbo = new MuOperation(db.getConnection());
		try {
		   boolean isValidUser = dbo.logindata(username, password);
			if (isValidUser) {
				   response.sendRedirect("Login.jsp");
	        } else {
	            response.getWriter().append("Invalid username or password");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        response.getWriter().append("Error validating user: ").append(e.getMessage());
	    }
		
		doGet(request, response);
	}

}
