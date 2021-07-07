package co.edu.utp.misiontic2022.c2;

public class Persona {
    //Atributos
    private int identificacion; // - identificacion:int
    private String nombre;
    private String apellido;
    private String genero;

    //Constructor
    public Persona(int identificacion, String nombre, String apellido, String genero){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    //Métodos Getter y Setter
    public int getIdentificacion(){
        return identificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Métodos
    public void caminar(){
        System.out.println("Caminar");
    }

    public boolean jugar(boolean estado){
        return estado;
    }

    public void comer(){
        System.out.println("Comer");
    }

    public String toString(){
        return "Identificación: " + identificacion + " Nombre: " + nombre + " Apellido: " + apellido + " Genero: " + genero;
    }
}
