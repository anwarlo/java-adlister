import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
//in session and cookies exercise by Fernando
public class JDBCTest {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());
                    Connection connection = DriverManager.getConnection(
                            "jdbc:mysql://localhost/movies_db?serverTimezone=UTC&useSSL=false",
                            "movies_user",
                            "password"
                    );
            Statement stmt = connection.createStatement();

            stmt.executeUpdate()
           ResultSet rs = stmt.executeQuery("select * from quotes");

           while (rs.next()){
               System.out.println("description = " + rs.getString("column_name"));
               System.out.println(rs.getString(1));//Using this way will vary on the more than specifying the column name.
           }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
