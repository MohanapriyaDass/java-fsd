import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
public int insert(Student s) throws ClassNotFoundException, SQLException {
	Connection con=DbUtil.getCon();
	if(con!=null) {
		System.out.println("Connection is established");
	}
	else {
		System.out.println("Connection failed");
	}
	String sql="insert into Student values (?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, s.getSid());
	ps.setString(2, s.getSname());
	ps.setString(3, s.getSemail());
	int row=ps.executeUpdate();
	return row;
}
public ResultSet retrieve() throws ClassNotFoundException, SQLException {
	Connection con=DbUtil.getCon();
	Statement st=con.createStatement();
	String sql="select * from Student";
	ResultSet rs=st.executeQuery(sql);
	return rs;
}
}
