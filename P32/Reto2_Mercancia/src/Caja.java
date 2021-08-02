public class Caja extends Mercancia {
    
    private static final double CAPACIDAD = 8.0;

    public Caja(double peso, double tamanio){
        super(peso, tamanio);
    }

    public Caja(double precioBase){
        super(precioBase);
    }

    public Caja(){
    }

    public double calcularPrecio(){
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * CAPACIDAD);  
    }
}
