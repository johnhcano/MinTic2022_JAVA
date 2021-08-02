public class Cabina extends Equipaje {
    
    private static final int TIEMPO = 2;

    public Cabina(double peso, double tamanio){
        super(peso, tamanio);
    }

    public Cabina(double precioBase){
        super(precioBase);
    }

    public Cabina(){
    }

    public double calcularPrecio(){
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * TIEMPO);  
    }
}
