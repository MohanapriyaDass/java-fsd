

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Insert() {
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
		Student s=new Student();
		s.setSid(Integer.parseInt(request.getParameter("id")));
		s.setSname(request.getParameter("name"));
		s.setSemail(request.getParameter("mail"));
		
		StudentDAO dao=new StudentDAO();
		PrintWriter pw=response.getWriter();
		
		try {
			int i=dao.insert(s);
			if(i>0) {
				response.sendRedirect("Display.html");
			}
			else {
				pw.print("Insertion failed");
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
