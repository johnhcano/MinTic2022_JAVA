package co.edu.utp.misiontic2022.c3;

public class Casilla {
    
    private int coordenadaX;
    private int coordenadaY;

    public Casilla(int coordenadaX, int coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String toString(){
        return "(x = " + coordenadaX + ", y = " + coordenadaY + ")"; 
    }
}
