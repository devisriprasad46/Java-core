
//Required imports for both servlet and JDBC
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("name");
		String umail=request.getParameter("mail");
		String upassword=request.getParameter("password");
		String ucity=request.getParameter("city");
		Connection con=null;
		PreparedStatement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/userinfo";
			String user="root";
			String pass="root";
			con=DriverManager.getConnection(url,user,pass);
			
			st=con.prepareStatement("Insert into users (uname,uemail,upass,ucity) values(?,?,?,?)");
			st.setString(1,uname);
			st.setString(2, umail);
			st.setString(3, upassword);
			st.setString(4, ucity);
			
			int rowsAffected=st.executeUpdate(); 
			PrintWriter out = response.getWriter();
			if(rowsAffected==0) {
				out.println("<h1>Registration Failed</h1>");
				System.out.println("Data insertion failed!");
			}
			else {
				out.println("<h1>Registration Success</h1>");
				System.out.println("Data inserted to database Sucessfully");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	    finally {
	    	try {
				con.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	
	    }
	}

}
