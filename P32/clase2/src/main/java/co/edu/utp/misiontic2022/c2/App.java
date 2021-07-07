package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona objPersona1 = new Persona(12345,"Jhon","Cano","M");
        Persona objPersona2 = new Persona(10001,"Harvin","Cano","M");

        System.out.println(objPersona1.getIdentificacion());
        System.out.println(objPersona2.getIdentificacion());
        System.out.println(objPersona2);
        System.out.println(objPersona2.getNombre());
        objPersona2.setIdentificacion(99887);
        objPersona2.setNombre("Ferney");
        System.out.println(objPersona2.getNombre());
        System.out.println(objPersona2);


        

        
    }


}
