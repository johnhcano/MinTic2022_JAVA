public class Volqueta extends Carro {
    
    private static final double CAPACIDAD = 8.0;

    public Volqueta(double peso, double tamanio){
        super(peso, tamanio);
    }

    public Volqueta(double precioBase){
        super(precioBase);
    }

    public Volqueta(){
    }

    public double calcularPrecio(){
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * CAPACIDAD);  
    }
}
