import java.sql.*;
//This line imports all the classes from the java.sql package.
// These classes are required for working with JDBC 
//(Java Database Connectivity) to interact with a database.
public class DBConnection {
//This class is designed to handle the database connection logic.
	public Connection con;//store the connection to the database
    public Statement pstmt;//a statement object for executing SQL queries.
//These lines declare two instance variables con and pstmt of 
//types Connection and Statement respectively.
    
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//This line dynamically loads the MySQL JDBC driver class.
//The forName method is used to load the class dynamically at runtime.
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/demodb","root","");
			//establishes a connection
//This line establishes a connection to the MySQL database. 
//The getConnection method of the DriverManager class is used, 
			//and it takes three parameters:
//JDBC URL, the database username (root), and the password
			pstmt = con.createStatement();
			//creates a Statement object
//This line creates a Statement object (pstmt) from the connection (con).
//The createStatement method is used to create a Statement object,
//which can be used to execute SQL queries.
		} catch (Exception e) {
			 System.err.println("Error: Unable to close database connection.");
	            e.printStackTrace();      
		}
	}

}
 

//The constructor dynamically loads the MySQL JDBC driver,
// establishes a connection to the database, and creates a statement object. 
