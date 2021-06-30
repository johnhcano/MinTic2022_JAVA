import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //capturar info por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite su nombre: ");
        String resultado = sc.nextLine(); //obtenemos del teclado el nombre
        System.out.println(saludo(resultado));

        System.out.print("Digite un número: ");
        int num = sc.nextInt();
        System.out.println(numeros(num));

        System.out.print("Digite los grados centigrados: ");
        double g = sc.nextDouble();
        System.out.println("La temperatura(F) es: " + grados(g));

        System.out.print("Digite un número: ");
        int num1 = sc.nextInt();
        System.out.println(operadorCondicional(num1));

    }

    //Metodo saludo
    public static String saludo(String nombre){
        return "Hola " + nombre + "!, Cómo estás?";
    }

    //Metodo doble o triple
    public static String numeros(int n){
        return n + "=> doble es " + (n*2) + ", triple es " + (n*3); 
    }

    //Metodo grados
    public static double grados(double gc){
        double f = 32 + (9 * (gc/5));
        return f;
    }
    
    //Metodo operador condicional
    public static String operadorCondicional(int n){
        return n%2==0?n+" es Par":n+" es Impar";

        /*String respuesta = "";
        if(n%2 == 0){
            respuesta = n + "es Par";
        }else{
            respuesta = n + "es Impar";
        }*/
    }
}
