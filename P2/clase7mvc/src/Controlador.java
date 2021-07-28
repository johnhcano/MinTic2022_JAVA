import java.awt.event.*;

public class Controlador implements ActionListener {
    
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnSumar.addActionListener(this);
        this.vista.btnRestar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("MVC");
        vista.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent evt){
        try{
            modelo.setNumero1(Integer.parseInt(vista.txtCampo1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.txtCampo2.getText()));
            if (evt.getSource() == vista.btnSumar){
                modelo.sumar();
            }
            if (evt.getSource() == vista.btnRestar){
                modelo.restar();
            }
            vista.txtResultado.setText(String.valueOf(modelo.getResultado()));
        }catch(NumberFormatException e){
            System.out.println(e);
            vista.mensajeError("No digitó números enteros...");
        }
    }
}
