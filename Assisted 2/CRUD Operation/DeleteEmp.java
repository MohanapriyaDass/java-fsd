

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmp
 */
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDAO dao=new EmployeeDAO();
		PrintWriter pw= response.getWriter();
		try {
			int i=dao.delete(Integer.parseInt(request.getParameter("Eid")));
			if(i>0) {
				pw.print("Deletion successful :) <br>");
				response.setContentType("text/html");
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeDriver.html");
				rd.include(request,response);
				
			}
			else {
				pw.print("Deletion Failed");
				
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
		e.printStackTrace();
	}
}

}
