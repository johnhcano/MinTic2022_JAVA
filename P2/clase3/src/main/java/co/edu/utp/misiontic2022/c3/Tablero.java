package co.edu.utp.misiontic2022.c3;

public class Tablero {
    
    private String nombrePartida;
    private Casilla casilla;

    public Tablero(String nombrePartida, Casilla casilla){
        this.nombrePartida = nombrePartida;
        this.casilla = casilla;
    }

    public String toString(){
        return "Nombre de la Partida: " + nombrePartida + " Casilla: " + casilla;
    }

}
