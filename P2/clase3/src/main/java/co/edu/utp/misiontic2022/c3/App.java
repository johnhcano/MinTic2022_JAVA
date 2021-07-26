package co.edu.utp.misiontic2022.c3;

//El diagrama de clases de obtuvo del documento 4 de la semana 2 página #3
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
        
        //Composición --relación fuerte-- Se hace a través del atributo de la clase
        Casilla casilla = new Casilla(3,2);
        System.out.println(casilla.toString());
        Tablero tablero = new Tablero("MisiónTIC2022",casilla);
        System.out.println(tablero.toString());

        //Agregación --relación débil-- Se hace a través del parámetro de un método
        System.out.println(casilla.verCasilla(casilla.getCoordenadaX(), casilla.getCoordenadaY() , torre11));
        System.out.println(casilla.verCasilla(casilla.getCoordenadaX(), casilla.getCoordenadaY() , alfil21));

        //Arreglos --Clase Lunes 26 de Julio de 2021
        //forma 1 => asignando inmediatamente los valores
        //int[] arreglo = {11, 4, 5, 20, 23, 2 ,14};
        //forma 2 => Reservando espacio en memoria para la asignación de valores.
        int[] arreglo = new int[7];
        arreglo[0] = 11;
        arreglo[1] = 4;
        arreglo[2] = 5;
        arreglo[3] = 20;
        arreglo[4] = 23;
        arreglo[5] = 2;
        arreglo[6] = 14;

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo[" + i + "]=" + arreglo[i]);
        }
        /* Prueba de escritorio
        i   i < arreglo.length  arreglo[i]     i++
        0   0 < 7  V            arreglo[0]=11   1 
            1 < 7  V            arreglo[1]=4    2
            2 < 7  V            arreglo[2]=5    3        
            3 < 7  V            arreglo[3]=20   4
            4 < 7  V            arreglo[4]=23   5
            5 < 7  V            arreglo[5]=2    6
            6 < 7  V            arreglo[6]=14   7
            7 < 7  F       
        */
    }
}
