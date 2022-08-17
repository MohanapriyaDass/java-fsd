

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmp
 */
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmp() {
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
		EmployeeDetails E= new EmployeeDetails();
		
		E.setEname(request.getParameter("Ename"));
		E.setEsalary(Float.parseFloat(request.getParameter("Esalary")));
		E.setEemail(request.getParameter("Eemail"));
		E.setEid(Integer.parseInt(request.getParameter("Eid")));
		
		EmployeeDAO dao=new EmployeeDAO();
		PrintWriter pw= response.getWriter();
		
		try {
			int i=dao.update(E);
			if(i>0) {
				pw.print("Updation Successful :)<br>");
				response.setContentType("text/html");
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeDriver.html");
				rd.include(request,response);
			}
			else {
				pw.print("updation failed");
				
			}
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}catch(SQLException e2) {
			e2.printStackTrace();
		}
}

}
