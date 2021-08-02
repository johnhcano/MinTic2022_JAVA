public class Bodega extends Equipaje {
    
    private static final double CAPACIDAD = 8.0;

    public Bodega(double peso, double tamanio){
        super(peso, tamanio);
    }

    public Bodega(double precioBase){
        super(precioBase);
    }

    public Bodega(){
    }

    public double calcularPrecio(){
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * CAPACIDAD);  
    }
}
