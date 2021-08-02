public class EjecutarCompra {
    
    public static void main(String[] args){
        
        CompraFlota objFlota = new CompraFlota();
        System.out.println(objFlota.compararCompra(12, 1000, 0.10));
        System.out.println(objFlota.compararCompra(24, 2000, 0));
        System.out.println(objFlota.compararCompra(6, 3000, 0.05));
        System.out.println(objFlota.compararCompra(18, 4000, 0.5));   
        
    }
}
