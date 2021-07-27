import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, "Hola!! Grupo #2");

        String ciudad = JOptionPane.showInputDialog("Ciudad en la que se encuentra: ");
        JOptionPane.showMessageDialog(null, "_.:: " + ciudad + " ::._");

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        JOptionPane.showMessageDialog(null, "Número Entero = " + n);

        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
        JOptionPane.showMessageDialog(null, "Número Real = " + a, "Ventana del Número Real", JOptionPane.ERROR_MESSAGE);
    }
}
