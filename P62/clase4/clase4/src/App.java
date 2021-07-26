import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        /*
        int arr[] = new int[5];

        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 4;
        arr[3] = 1;
        arr[4] = 9;

        //Recorrer el arreglo "arr"
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        */

        Alumno alumnos[] = new Alumno[3];

        alumnos[0] = new Alumno(2001, "Byron", "Cano", "b@gmail.com");
        alumnos[1] = new Alumno(2002, "Jhon", "Beltrán", "j@gmail.com");
        alumnos[2] = new Alumno(2003, "Harvin", "Henao", "h@gmail.com");

        for(int i = 0; i < alumnos.length; i++){
            System.out.println(alumnos[i].toString());
        }

        /* Ventanas con JOptionPane */
        //Mostrar información
        JOptionPane.showMessageDialog(null,"Hola!!! Grupo #62");
        
        //Obtener por parte del usuario datos de entrada
        String nombre = JOptionPane.showInputDialog("Por favor escriba su nombre...");
        JOptionPane.showMessageDialog(null, "Bienvenido!!! .:" + nombre + ":.");

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número1.."));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite número2.."));
        JOptionPane.showMessageDialog(null, "n1=" + n1 + "n2=" + n2);

    }
}
