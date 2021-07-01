import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Mostrar por pantalla un mensaje
        System.out.println("Hello, World!");

        // Ejemplo del post incremento
        int x = 1;
        System.out.println(x++);
        System.out.println(x);

        //objeto "sc" para acceder a los metodos de la clase Scanner
        Scanner sc = new Scanner(System.in);

        //Invocar el metodo dtNumero
        System.out.print("Digite un número: ");
        int num = sc.nextInt();
        System.out.println(dtNumero(num));

        //Invocar el metodo grados
        System.out.print("Digite los grados centígrados: ");
        double c = sc.nextDouble();
        System.out.println("Los grados Fahrenheit = " + grados(c));

        //Invocar el metodo operadorCondicional
        System.out.print("Digite un número: ");
        int n = sc.nextInt();
        System.out.println(operadorCondicional(n));

    }

    public static String dtNumero(int n) {
        return "doble=" + (n * 2) + " triple=" + (n * 3);
    }    

    public static double grados(double c) {
        return 32 + (9 * (c / 5));
    }

    public static String operadorCondicional(int n) {
        return n%2 == 0?n + " es par":n + " es impar";
        /*
        String r = "";
        if (n % 2 == 0) {
            r = n + " es par";
        } else {
            r = n + " es impar";
        }
        return r;
        */
    }
}
