package co.edu.utp.misiontic2022.c3;

//El diagrama de clases se obtiene de la 
// Diapositiva #17 de la clase 3 de la unidad 1.

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona objPersona1 = new Empleado("Byron", 35, 2345.25);
        Persona objPersona2 = new Cliente("Harvin", 34, "3214567890");

        //Polimorfismo --> Capacidad que tiene un método de comportarse de diferentes maneras según el objeto que lo llame.

        objPersona1.mostrar();
        objPersona2.mostrar();

        //Composición
        Empresa objEmpresa = new Empresa("MisiónTic2022", (Empleado)objPersona1);
        System.out.println(objEmpresa.toString());


    }
}
