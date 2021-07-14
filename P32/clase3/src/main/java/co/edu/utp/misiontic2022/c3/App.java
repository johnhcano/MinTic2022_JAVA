package co.edu.utp.misiontic2022.c3;

//El diagrama de clases que será utilizado para el ejercicio de herencia, 
// composición y agregación está en la presentación #3 de la unidad 1 slide #17 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona objPersona1 = new Empleado("Byron", 20, 10546.32);
        Persona objPersona2 = new Cliente("Javier", 30, "(032) 446 23 45");
        
        Persona objPersona3 = new Empleado("Miguel", 25, 945.23);



        //Polimorfismo: Capacidad que tiene un método de comportarse de diferentes maneras, según el objeto que lo llame. ej: mostrar()
        objPersona1.mostrar();
        objPersona2.mostrar();
        objPersona3.mostrar();

        System.out.println(objPersona1);
        System.out.println(objPersona2);
        System.out.println(objPersona3);
        

        //Se crea el objeto de Empresa para validar la relación entre Empresa y Empleado
        //Composición --> Relación fuerte --> Se hace a través del atributo de la clase.
        Empresa objEmpresa = new Empresa("MisiónTIC2022", (Empleado)objPersona3);
        System.out.println(objEmpresa);

        //Agregación --> Relación débil --> Se hace a través de un parámetro de un método de la clase Empresa.
        System.out.println(objEmpresa.informacionCliente((Cliente)objPersona2));
        
    }
}
