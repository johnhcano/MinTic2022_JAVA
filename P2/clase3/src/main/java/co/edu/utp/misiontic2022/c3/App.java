package co.edu.utp.misiontic2022.c3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ficha torre11 = new Torre ("Blanco", 21.30);
        Ficha torre21 = new Torre ("Negro", 21.30);
        System.out.println(torre11.toString());
        System.out.println(torre21.toString());

        Ficha alfil21 = new Alfil("Negro", 17.25);

        //Polimorfismo --> Capacidad que tiene un método de
        //comportarse según el objeto que lo llame.
        System.out.println(torre11.mover());
        System.out.println(alfil21.mover());
        
        //Composición --relación fuerte--
        Casilla casilla = new Casilla(3,2);
        System.out.println(casilla.toString());
        Tablero tablero = new Tablero("MisiónTIC2022",casilla);
        System.out.println(tablero.toString());
    }
}
