package co.edu.utp.misiontic2022.c3;

public class Cliente extends Persona{

    private String telefonoContacto;

    public Cliente(String nombre, int edad, String telefonoContacto){
        super(nombre, edad);
        this.telefonoContacto = telefonoContacto;
    }

    public void mostrar(){
        System.out.println("Cliente --> Nombre: " + super.getNombre() + " Edad: " + super.getEdad() + " Teléfono: " + telefonoContacto);
    }

}