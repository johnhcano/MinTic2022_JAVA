package view;

import controller.ControladorRequerimientosReto4;
//import model.vo.LiderCiudad;
//import model.vo.SumaProveedor;
import model.vo.ProyectoCiudad;

import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1() {
        try{
            ArrayList<ProyectoCiudad> rankingProyectosCiudad = controlador.consultarProyectoCiudad();

            System.out.println("-----Proyecto Ciudad-------");
            for(ProyectoCiudad proyectoCiudad: rankingProyectosCiudad){
                System.out.printf("%s %s %s %n", proyectoCiudad.getConstructora(), proyectoCiudad.getFechaInicio(), proyectoCiudad.getClasificacion());
            }
        }catch(SQLException e){
            System.out.println(e);
        }

    }

    public static void requerimiento3() {

        

    }

    public static void requerimiento4() {

        

    }

}
