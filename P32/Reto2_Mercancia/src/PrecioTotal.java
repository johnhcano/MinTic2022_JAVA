public class PrecioTotal {

    private double totalPrecios;
    private double totalCaja;
    private double totalDocumento;
    private Mercancia[] mercancia;

    public PrecioTotal(Mercancia[] mercancia) {
        this.mercancia = mercancia;
    }

    public void calcularTotales() {
        
        for (int i = 0; i <= mercancia.length - 1; i++) {
            
            totalPrecios += mercancia[i].calcularPrecio();

            if (mercancia[i] instanceof Caja) {
                totalCaja += mercancia[i].calcularPrecio();
            } else {
                totalDocumento += mercancia[i].calcularPrecio();
            }
        }
    }

    public void mostrarTotales() {
        // Calculo de totales
        calcularTotales();
        System.out.println("Total Mercancía " + totalPrecios);
        System.out.println("Total Cajas " + totalCaja);
        System.out.println("Total Documentos " + totalDocumento);
    }

}