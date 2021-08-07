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
import model.vo.SumaProveedor;

public class SumaProveedorDao {

    public ArrayList<SumaProveedor> rankingSumaProveedor() throws SQLException {

        ArrayList<SumaProveedor> respuesta = new ArrayList<SumaProveedor>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "SELECT SUM(Cantidad) AS Cantidad " + "FROM Compra " + "WHERE Proveedor = 'Cementos El Dorado';";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            // Recorrer los registros en los VO específicos
            while (resultSet.next()) {
                SumaProveedor sumaProveedor = new SumaProveedor();
                sumaProveedor.setCantidad(resultSet.getString("Cantidad"));

                // Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(sumaProveedor);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error en la consulta: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        // Retornar la colección de vo's
        return respuesta;

    }

}