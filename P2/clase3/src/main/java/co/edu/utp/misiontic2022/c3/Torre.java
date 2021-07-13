package co.edu.utp.misiontic2022.c3;

public class Torre extends Ficha {
    
    //Atributos
    private double volumen; 
    
    //Constructor
    public Torre (String color, double volumen) {
        super(color);
        this.volumen = volumen;
    }

    public String toString(){
        return "Torre => Color: " + super.getColor() + " Volumen: " + volumen;
    }

    public String mover(){
        return "Se mueve horizontal y vertical sin límite de casillas";
    }

}