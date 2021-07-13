package co.edu.utp.misiontic2022.c3;

public class Casilla {
    
    private int coordenadaX;
    private int coordenadaY;

    public Casilla(int coordenadaX, int coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    
    public int getCoordenadaX(){
        return coordenadaX;
    }

    public int getCoordenadaY(){
        return coordenadaY;
    }

    public String verCasilla(int coordenadaX, int coordenadaY, Ficha ficha){
        return "x:" + coordenadaX + " y:" + coordenadaY + " Ficha: " + ficha;
    }
    
    public String toString(){
        return "(x = " + coordenadaX + ", y = " + coordenadaY + ")"; 
    }

}
