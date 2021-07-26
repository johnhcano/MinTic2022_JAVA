import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, "Hola!! Grupo #32");

        String nombre = JOptionPane.showInputDialog("Escriba su nombre..");
        JOptionPane.showMessageDialog(null, "Nombre .: " + nombre + " :.");

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número_1"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite número_2"));

        JOptionPane.showMessageDialog(null, "n1=" + n1 + " n2=" + n2);
        JOptionPane.showMessageDialog(null, "la suma es: " + (n1 + n2));
        JOptionPane.showMessageDialog(null, "la resta es: " + (n1 - n2));
        JOptionPane.showMessageDialog(null, "la multiplición es: " + (n1 * n2));
        JOptionPane.showMessageDialog(null, "la división es: " + (n1 / n2));
    }
}
