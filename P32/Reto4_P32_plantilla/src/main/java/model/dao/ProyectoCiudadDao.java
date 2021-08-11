package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.ProyectoCiudad;

public class ProyectoCiudadDao {

    public ArrayList<ProyectoCiudad> rankingProyectosCiudad() throws SQLException {


        try {
            
            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando Proyecto Ciudad!!" + e);
            
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }
        
            return respuesta;
    }
    
}