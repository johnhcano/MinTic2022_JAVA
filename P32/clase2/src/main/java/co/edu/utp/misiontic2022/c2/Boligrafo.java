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

    //Getter y Setter
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color =  color;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getModelo(){
        return modelo;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }
    
    //Métodos
    public void escribir(String marca, String color){
        System.out.println(marca + " Escribiendo.... en color: " + color);
    }

    public void dibujar(String marca, String color){
        System.out.println(marca + " Dibujando..... en color: " + color);
    }

    public String toString(){
        return "Boligrafo: { Color: " + color + " Marca: " + marca + " Material: " + material + " Modelo: " + modelo + "}";
    }

}