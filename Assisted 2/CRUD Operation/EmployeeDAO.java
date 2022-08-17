import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {
	public int insert(EmployeeDetails E) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getCon();
		if(con!=null) {
			System.out.println("Connection is established");
		}
		else {
			System.out.println("Connection failed");
		}
		String sql="insert into EmployeeDetails values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, E.getEid());
		ps.setString(2, E.getEname());
		ps.setFloat(3,E.getEsalary());
		ps.setString(4, E.getEemail());
		int row=ps.executeUpdate();
		return row;
}
	public ResultSet retrieve() throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		String sql="select * from EmployeeDetails";
		ResultSet rs=st.executeQuery(sql);
		return rs;
	}
	public int delete(int Eid) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		String sql="delete from EmployeeDetails where Eid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Eid);
		int row=ps.executeUpdate();
		return row;
		
	}
	public int update(EmployeeDetails E) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		String sql="update EmployeeDetails set Ename=?,Esalary=?,Eemail=? where Eid=? ";
		PreparedStatement ps=con.prepareStatement(sql);	
		ps.setString(1, E.getEname());
		ps.setFloat(2,E.getEsalary());
		ps.setString(3, E.getEemail());
		ps.setInt(4, E.getEid());
		int row=ps.executeUpdate();
		return row;
	}
}
