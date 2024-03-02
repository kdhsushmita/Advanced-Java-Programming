package lab4;
import java.sql.*; 
//These lines import necessary classes from the java.sql package. 
//These classes are required for working with JDBC 
//(Java Database Connectivity) to interact with a database.

public class extractNameforKtm {
	 public static void main(String[] args) {
//This line defines a string variable url that holds the JDBC URL 
//for the MySQL database connection.
	        String url = "jdbc:mysql://localhost:3306/extractname";
//hostname (localhost),port no(3306),& database name (extractname).
	        String user = "root";
	        String password = "";

	        String sql = "SELECT name FROM student WHERE district ="
	        		+ " 'Kathmandu'";

	        try (
	        		Connection connection = DriverManager.getConnection
	        		(url, user, password);//establishes conn to the db

	                // Create a statement using a PreparedStatement to 
	        		//avoid SQL injection
	                PreparedStatement preparedStatement = 
	                		connection.prepareStatement(sql);

	                // Execute the query and get the result set
	                ResultSet resultSet = preparedStatement.executeQuery())
	        {

	            // Process the result set
	            while (resultSet.next()) {
	                String studentName = resultSet.getString("name");
	                System.out.println("Student Name: " + studentName);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
