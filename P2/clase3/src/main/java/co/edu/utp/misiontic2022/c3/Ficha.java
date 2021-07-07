package co.edu.utp.misiontic2022.c3;

public class Ficha {

    //Atributos
    private String color;

    //Constructor
    public Ficha(String color){
        this.color =  color;
    }

    //Métodos Getter y Setter

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //Métodos
    public boolean comer(){
        return false;
    }

    public boolean mover(){
        return false;
    }

    public String toString(){
        return "Color Ficha: " + color;
    }
}