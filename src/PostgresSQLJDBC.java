import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresSQLJDBC {
    //new comment added 
   public static void main(String[] args) {
      String url = "jdbc:postgresql://localhost:5432/postgres";
      String user = "postgres";
      String password = "root";
      
      try (Connection conn1 = DriverManager.getConnection(url, user, password)) {
          System.out.println("Connected to the PostgreSQL server successfully.");
      } catch (SQLException e) {
          System.out.println("Connection failure!");
          e.printStackTrace();
      }
   }
}
