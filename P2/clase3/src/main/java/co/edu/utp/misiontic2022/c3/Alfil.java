package co.edu.utp.misiontic2022.c3;

public class Alfil extends Ficha{

    private double volumen;

    public Alfil(String color, double volumen){
        super(color);
        this.volumen = volumen;
    }

    public String mover(){
        return "Se mueve en diagonal, sin límite de casillas ";
    }

    public String toString(){
        return "Alfil => Color: " + super.getColor() + " Volumen: " + volumen;
    }
    
}
