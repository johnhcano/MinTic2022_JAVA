package co.edu.utp.misiontic2022.c2;

public class Boligrafo {

    //Atributos
    private String color;
    private String marca;
    private String material;
    private int modelo;

    //Constructor
    public Boligrafo(String color, String marca, String material, int modelo) {
        this.color = color;
        this.marca = marca;
        this.material = material;
        this.modelo = modelo;
    }

    //Métodos
    public void escribir(){
        System.out.println("Escribiendo...!!");
    }

    public void dibujar(){
        System.out.println("Dibujando...!!");
    }

}