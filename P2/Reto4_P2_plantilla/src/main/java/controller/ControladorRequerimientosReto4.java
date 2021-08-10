package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.ProyectoCiudadDao;
import model.vo.ProyectoCiudad;
//import model.dao.LiderCiudadDao;
//import model.vo.LiderCiudad;
//import model.dao.SumaProveedorDao;
//import model.vo.SumaProveedor;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {

    private ProyectoCiudadDao proyectoCiudadDao;
    //private LiderCiudadDao liderCiudadDao;
    //private SumaProveedorDao sumaProveedorDao;

    public ControladorRequerimientosReto4(){
        this.proyectoCiudadDao = new ProyectoCiudadDao();
        //this.liderCiudadDao = new LiderCiudadDao();
        //this.sumaProveedorDao = new SumaProveedorDao();
    }

    public ArrayList<ProyectoCiudad> consultarProyectoCiudad() throws SQLException {
        return this.proyectoCiudadDao.rankingProyectosCiudad();
    }

/*    public ArrayList<LiderCiudad> consultarLiderCiudad() throws SQLException {
        return this.liderCiudadDao.rankingLiderCiudad();
    }

    public ArrayList<SumaProveedor> consultarSumaProveedor() throws SQLException {
        return this.sumaProveedorDao.rankingSumaProveedor();
    }
*/
}
