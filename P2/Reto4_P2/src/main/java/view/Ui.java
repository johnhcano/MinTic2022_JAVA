package view;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

import controller.ControladorRequerimientosReto4;
import model.vo.LiderCiudad;
import model.vo.SumaProveedor;
import model.vo.ProyectoCiudad;

public class Ui extends JFrame {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
    // Atributos de la vista
    private DefaultTableModel model;
    private JTable table;

    public Ui() {
        // Se contruye panel
        JPanel panel = new JPanel();
        this.setTitle("Reto 5");
        this.setBounds(0, 0, 500, 500);
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // panel.setLayout(new BorderLayout());
        // COnstruir tabla
        model = new DefaultTableModel();
        table = new JTable(model);

        // Se añade titulo al modelo
        model.addColumn("Constructora");
        model.addColumn("Fecha Inicio");
        model.addColumn("Clasificación");
        panel.add(new JScrollPane(table));
        requerimiento1();
        this.add(panel, BorderLayout.CENTER);
    }

    public void requerimiento1() {

        try {

            ArrayList<ProyectoCiudad> proyectos = controlador.consultarProyectoCiudad();
            // Array que almacena los resultados
            for (int i = 0; i < proyectos.size(); i++) {
                Object[] row = { proyectos.get(i).getConstructora(), proyectos.get(i).getFechaInicio(),
                        proyectos.get(i).getClasificacion() };
                model.addRow(row);
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }

    }    
}