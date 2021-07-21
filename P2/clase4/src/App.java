import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {

        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:hr.db");
            if (connection != null) {
                System.out.println("Conexión exitosa");
            }

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            ResultSet rs = statement.executeQuery("select * from employees");
            while(rs.next())
            {
                // read the result set
                System.out.println("id = " + rs.getInt("employee_id"));
                System.out.println("apellido = " + rs.getString("last_name"));
                System.out.println("nombre = " + rs.getString("first_name"));
            }


        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.out.println("Error en la conexión");
        }

    }
}
