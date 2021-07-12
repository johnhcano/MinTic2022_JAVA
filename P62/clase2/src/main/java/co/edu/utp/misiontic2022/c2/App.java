package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) //arguments
    {
        Scanner sc = new Scanner(System.in);

        Ficha objFicha1 = new Ficha("Caballo", "Blanco", 4);
        //Ficha objFicha2 = new Ficha("Torre", "Blanco", 8);

        System.out.println(objFicha1.toString());
        System.out.println(objFicha1.desplazamiento(objFicha1.getNombre()));

        objFicha1.setNombre("Reina");

        System.out.println(objFicha1.toString());
        System.out.println(objFicha1.desplazamiento(objFicha1.getNombre()));

        System.out.println(objFicha1.movimiento(objFicha1.getPosicion(), 34));
        objFicha1.setPosicion(34);
        System.out.println(objFicha1.movimiento(objFicha1.getPosicion(), 1));
        objFicha1.setPosicion(1);

        int pos = 0;
        System.out.print("Digite la posición final: ");
        pos = sc.nextInt();
        System.out.println(objFicha1.movimiento(objFicha1.getPosicion(), pos));
        objFicha1.setPosicion(pos);
        System.out.print("Digite la posición final: ");
        pos = sc.nextInt();
        System.out.println(objFicha1.movimiento(objFicha1.getPosicion(), pos));
    }
}
