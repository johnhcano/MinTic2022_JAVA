import javax.swing.*;

public class Vista extends JFrame {

    public JTextField txtCampo1 = new JTextField(10);
    public JLabel etiquetaSuma = new JLabel("+");
    public JTextField txtCampo2 = new JTextField(10);
    public JButton btnSumar = new JButton("Sumar");
    public JTextField txtResultado = new JTextField(10);

    public Vista() {

        JPanel panelCalculadora = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        panelCalculadora.add(txtCampo1);
        panelCalculadora.add(etiquetaSuma);
        panelCalculadora.add(txtCampo2);
        panelCalculadora.add(btnSumar);
        panelCalculadora.add(txtResultado);
        
        this.add(panelCalculadora);
    }

    public int getTxtCampo1(){
        return Integer.parseInt(txtCampo1.getText());
    }

    public int getTxtCampo2(){
        return Integer.parseInt(txtCampo2.getText());
    }

    public int getTxtResultado(){
        return Integer.parseInt(txtResultado.getText());
    }

    public void setTxtResultado(int num){
        txtResultado.setText(String.valueOf(num));
    }

    public void mensajeError(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    
}