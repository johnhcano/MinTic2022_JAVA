package co.edu.utp.misiontic2022.c3;

public class Empleado extends Persona{

    private double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto){
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public void mostrar(){
        System.out.println("Empleado.....");
    }

    public String toString(){
        return "Empleado --> Nombre: " + super.getNombre() + " Edad: " + super.getEdad() + " Sueldo: " + sueldoBruto;
    }

}