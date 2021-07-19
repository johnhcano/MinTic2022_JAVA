public class Computador {
    
    private String marca;
    private int memoria;
    private double almacenamiento;

    public Computador(String marca, int memoria, double almacenamiento){
        this.marca = marca;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
    }

    public void prender(){
        System.out.println("Prender......");
    }

    public String toString(){
        return "Marca:" + marca + " Memoria:" + memoria + " Almacenamiento:" + almacenamiento; 
    }
}
