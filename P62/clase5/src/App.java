import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        
        Connection connection;
        
        try {
            //Conexión a la base de datos "hr.db"
            connection = DriverManager.getConnection("jdbc:sqlite:hr.db");
            if(connection != null){
                System.out.println("Conexión exitosa");
            }

            //Creación del objeto "statement" para ejecutar las consultas
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

            //--------------

            statement.executeUpdate("drop table if exists misiontic");
            statement.executeUpdate("create table misiontic (id integer, name string)");
            statement.executeUpdate("insert into misiontic values(1, 'Ciclo1')");
            statement.executeUpdate("insert into misiontic values(2, 'Ciclo2')");

            ResultSet consulta = statement.executeQuery("SELECT * FROM misiontic");
            while(consulta.next())
            {
                // read the result set
                System.out.println("name = " + consulta.getString("name"));
                System.out.println("id = " + consulta.getInt("id"));
            }

        }
        catch (Exception e) {
                //TODO: handle exception
                System.err.println(e.getClass().getName()+ ":"+e.getMessage());
                System.out.println("Error en la conexión");
            }
    }

}

