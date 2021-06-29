import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("Digite su nombre: ");
        //capturar info por teclado
        Scanner sc = new Scanner(System.in);
        String resultado = sc.next(); //obtenemos del teclado el nombre
        System.out.println(saludo(resultado));
    }

    //Metodo saludo
    public static String saludo(String nombre){
        return "Hola " + nombre + "!, Cómo estás?";
    }

}
