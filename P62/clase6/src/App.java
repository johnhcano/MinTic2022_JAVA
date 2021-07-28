import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {

    private JButton boton;
    private JTextField campo1;
    private JTextField campo2;
    private JLabel resultado;

    public App() {
        
        this.setTitle("Ejemplo");
        this.setBounds(100, 100, 300, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        boton = new JButton();
        boton.setText("Sumar");
        boton.setBounds(40, 100, 100, 50);
        this.add(boton);

        campo1 = new JTextField();
        campo1.setBounds(40, 50, 100, 30);
        this.add(campo1);

        campo2 = new JTextField();
        campo2.setBounds(40, 0, 100, 30);
        this.add(campo2);

        resultado = new JLabel();
        resultado.setText("0");
        resultado.setBounds(50, 150, 100, 30);
        this.add(resultado);

        // Adicionando un evento action al botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                // Acción que realizará el botón al hacer clic en el.
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                int suma = num1 + num2;
                resultado.setText(String.valueOf(suma));
            }
        });
    } // constructor

    public static void main(String[] args) {
        App ejemplo = new App();
        ejemplo.setVisible(true);
    } // método main

} // clase