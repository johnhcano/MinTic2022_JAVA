package co.edu.utp.misiontic2022.c3;

public class Casilla {
    
    //CONSTANTES
    private final static int COORDENADAX = 2;
    private final static int COORDENADAY = 5;

    private int coordenadaX;
    private int coordenadaY;

    public Casilla(){
        coordenadaX = COORDENADAX;
        coordenadaY = COORDENADAY;
    }
    
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
