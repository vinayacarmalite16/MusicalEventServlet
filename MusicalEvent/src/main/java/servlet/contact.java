package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.MuConnection;
import database.MuOperation;

/**
 * Servlet implementation class contact
 */
@WebServlet("/contact")
public class contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contact() {
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
		
		String name=request.getParameter("Name");
		String phone=request.getParameter("Phone");
		String email=request.getParameter("Email");
		String comment=request.getParameter("Comment");
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(comment);
		
		MuConnection db=new MuConnection();
		MuOperation dbo = new MuOperation(db.getConnection());
		
		try {
			dbo.createTable1();
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			dbo.insertDa(name,phone,email,comment);
			response.sendRedirect("Contact.jsp");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
