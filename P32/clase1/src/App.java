import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Mostrar texto en pantalla

        // "sc" es el objeto que permite acceder a los métodos de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Invocar el método "saludar"
        System.out.print("Digite su nombre: ");
        String nombre = sc.nextLine();
        System.out.println(saludar(nombre));

        // Invocar el método "dtNumero"
        System.out.print("Digite un número: ");
        int num = sc.nextInt();
        System.out.println(dtNumero(num));

        // Invocar el método "conversionGrados"
        System.out.print("Digite los grados centígrados: ");
        double c = sc.nextDouble();
        System.out.println("Grados Fahrenheit: " + conversionGrados(c));

        // Invocar el método "operadorCondicional"
        System.out.print("Digite un número: ");
        int n = sc.nextInt();
        System.out.println(operadorCondicional(n));
    }

    public static String saludar(String msg) {
        return "Hola " + msg + "!";
    }

    public static String dtNumero(int n) {
        return "Doble=" + (n * 2) + " Triple=" + (n * 3);
    }

    public static double conversionGrados(double c) {
        return 32 + (9 * (c / 5));
    }

    public static String operadorCondicional(int n) {
        return n % 2 == 0 ? n + " es par" : n + " es impar";
        /*
        String resultado = "";
        if (n % 2 == 0){
            resultado = n + " es par";
        }else{
            resultado = n + " es impar";
        }
        return resultado;
        */
    }

}