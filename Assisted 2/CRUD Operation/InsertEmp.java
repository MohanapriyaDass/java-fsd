

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertEmp
 */
public class InsertEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmp() {
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
		E.setEid(Integer.parseInt(request.getParameter("Eid")));
		E.setEname(request.getParameter("Ename"));
		E.setEsalary(Float.parseFloat(request.getParameter("Esalary")));
		E.setEemail(request.getParameter("Eemail"));
		
		EmployeeDAO dao=new EmployeeDAO();
		PrintWriter pw= response.getWriter();
		
		try {
			int i=dao.insert(E);
			if(i>0) {
				pw.print("Insertion successful :)<br>");
				response.setContentType("text/html");
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeDriver.html");
				rd.include(request,response);
				
			}
			else {
				pw.print("Insertion failed");
				
			}
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}catch(SQLException e2) {
			e2.printStackTrace();
		}
	}

}
