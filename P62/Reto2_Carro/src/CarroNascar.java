public class CarroNascar extends Carro {
    
    private static final int TIEMPO = 2;

    public CarroNascar(double peso, double tamanio){
        super(peso, tamanio);
    }

    public CarroNascar(double precioBase){
        super(precioBase);
    }

    public CarroNascar(){
    }

    public double calcularPrecio(){
        return super.getPrecioBase() + (super.getPeso() * super.getTamanio() * TIEMPO);  
    }
}
