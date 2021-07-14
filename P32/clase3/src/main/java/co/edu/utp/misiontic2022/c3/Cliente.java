package co.edu.utp.misiontic2022.c3;

public class Cliente extends Persona {

    private String numeroDeContacto;

    public Cliente(String nombre, int edad, String numeroDeContacto){
        super(nombre, edad);
        this.numeroDeContacto = numeroDeContacto;
    }

    public void mostrar(){
        System.out.println("Cliente.....");
    }

    public String getNumeroContacto(){
        return numeroDeContacto;
    }

    public String toString(){
        return "Cliente -> Nombre: " + super.getNombre() + " Edad: " + super.getEdad() + " Teléfono de Contacto: " + numeroDeContacto;
    }
}