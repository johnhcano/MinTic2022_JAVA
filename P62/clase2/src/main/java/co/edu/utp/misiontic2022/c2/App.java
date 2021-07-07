package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ficha objFicha1 = new Ficha("Caballo", "Blanco", 4);
        System.out.println(objFicha1.toString());
        System.out.println(objFicha1.desplazamiento());
    }
}
