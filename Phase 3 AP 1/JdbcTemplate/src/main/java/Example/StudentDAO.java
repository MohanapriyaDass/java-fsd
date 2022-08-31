package example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO {
private JdbcTemplate temp;

public void setTemp(JdbcTemplate temp) {
	this.temp = temp;
}

/*>JDBC
 * -----
 * Driver
 * connection
 * prepared statement
 * execute a query
 * close the connection
 * */

/*JdbcTemplate
 * 
 * Driver
 * connection-spring.xml
 * 
 * */
//insert,update,delete -JDBC-executeUpdate()----JdbcTemplate-update()

public int insert(Student s) {
	//insert into student values(1,'karthik','k@c.c');
String sql="insert into student values("+s.getId()+",'"+s.getName()+"','"+s.getEmail()+"')";
System.out.println(sql);
return temp.update(sql);
}


/*retrival -select -ResultSet-executeQuery*/
public List<Student> retrieve(){
	String sql="select * from Student";
	return temp.query(sql,new ResultSetExtractor<List<Student>>() {

		public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			ArrayList<Student> al=new ArrayList<Student>();
			while(rs.next()) {
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				al.add(s);
			}
			return al;
		}
	});
}
}
