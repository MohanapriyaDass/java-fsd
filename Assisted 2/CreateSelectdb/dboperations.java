

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dboperations
 */
public class dboperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dboperations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DbUtilDatabase db=new DbUtilDatabase();
		
		try {
            PrintWriter out = response.getWriter();
            
            db.checkConnection();
         
           
           Connection con=DbUtilDatabase.getCon();
           
           Statement st = con.createStatement();
           st.executeUpdate("create database database1");
           out.println("Created database:database1<br>");
           st.executeUpdate("use database1");
           out.println("Selected database: database1<br>");
           st.executeUpdate("drop database database1");

           out.println("Dropped database: database1<br>");
                               
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
	   e.printStackTrace();
   }
}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
