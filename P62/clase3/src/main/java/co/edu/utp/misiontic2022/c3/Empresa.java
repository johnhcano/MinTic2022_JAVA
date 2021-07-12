package co.edu.utp.misiontic2022.c3;

public class Empresa {
    
    private String nombre;
    private Empleado empleado;

    public Empresa(String nombre, Empleado empleado){
        this.nombre = nombre;
        this.empleado = empleado;
    }

    public String toString(){
        return "Empresa: " + nombre + " Empleado: " + empleado.toString();
    }

}
