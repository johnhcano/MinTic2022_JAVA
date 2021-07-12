package co.edu.utp.misiontic2022.c3;

public class Persona {

    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void mostrar(){
    }

}