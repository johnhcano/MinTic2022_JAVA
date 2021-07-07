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

        System.out.println(torre11.mover());
        
    }
}
