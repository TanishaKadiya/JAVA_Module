import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

    	public static Connection getConnection() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver"); //load driver
		 System.out.println("Driver Loaded");
		 Connection con=null;
		 try {
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","javauser","9316255169");
            System.out.println("Database: " + con.getCatalog());
            System.out.println("Auto Commit: " + con.getAutoCommit());

			System.out.println("Connection established ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
    public static void main(String[] args) {
        System.out.println("Connecting to MySQL database...");
        // Code to establish a connection to the MySQL database would go here
        // For example, using JDBC:
        // String url = "jdbc:mysql://localhost:3306/mydatabase";
        // String username = "root";
        // String password = "password";
        // Connection conn = DriverManager.getConnection(url, username, password);
        	try {
			Connection con=MySqlConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Connection established successfully!");
    }   
}
