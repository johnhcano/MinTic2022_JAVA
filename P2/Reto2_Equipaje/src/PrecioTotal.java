public class PrecioTotal {

    private double totalPrecios;
    private double totalBodega;
    private double totalCabina;
    private Equipaje[] equipaje;

    public PrecioTotal(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }

    public void calcularTotales() {
        
        for (int i = 0; i <= equipaje.length - 1; i++) {
            
            totalPrecios += equipaje[i].calcularPrecio();

            if (equipaje[i].getClass() == Bodega.class) {
                totalBodega += equipaje[i].calcularPrecio();
            } else {
                totalCabina += equipaje[i].calcularPrecio();
            }
        }
    }

    public void mostrarTotales() {
        // Calculo de totales
        calcularTotales();
        System.out.println("Total Equipaje " + totalPrecios);
        System.out.println("Total Bodega " + totalBodega);
        System.out.println("Total Cabina " + totalCabina);
    }

}