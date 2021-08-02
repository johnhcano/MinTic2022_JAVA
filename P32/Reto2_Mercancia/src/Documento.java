public class Documento extends Mercancia {
    
    private static final int TIEMPO = 2;

    public Documento(double peso, double tamanio){
        super(peso, tamanio);
    }

    public Documento(double precioBase){
        super(precioBase);
    }

    public Documento(){
    }

    public double calcularPrecio(){
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * TIEMPO);  
    }
}
