public class App {
    public static void main(String[] args) {
        
        pruebaPublica1();
        pruebaPublica2();
        pruebaPrivada1();
        pruebaPrivada2();

    }
    
    public static void pruebaPublica1(){    
        Equipaje equipaje[] = new Equipaje[5];
        
        equipaje[0] = new Bodega(100.0, 10.0);
        equipaje[1] = new Bodega(200);
        equipaje[2] = new Cabina(150, 20.0);
        equipaje[3] = new Cabina();
        equipaje[4] = new Bodega();

        PrecioTotal solucion = new PrecioTotal(equipaje);
        
        solucion.mostrarTotales();
    }

    public static void pruebaPublica2(){    
        Equipaje equipaje[] = new Equipaje[5];
        
        equipaje[0] = new Bodega(10.0, 5.0);
        equipaje[1] = new Bodega(2500);
        equipaje[2] = new Cabina(1500, 320.0);
        equipaje[3] = new Cabina();
        equipaje[4] = new Bodega();

        PrecioTotal solucion = new PrecioTotal(equipaje);
        
        solucion.mostrarTotales();
    }

    public static void pruebaPrivada1(){    
        Equipaje equipaje[] = new Equipaje[5];
        
        equipaje[0] = new Bodega(310.0, 180.0);
        equipaje[1] = new Bodega(2000);
        equipaje[2] = new Cabina(1500, 2.0);
        equipaje[3] = new Cabina();
        equipaje[4] = new Bodega();

        PrecioTotal solucion = new PrecioTotal(equipaje);
        
        solucion.mostrarTotales();
    }

    public static void pruebaPrivada2(){    
        Equipaje equipaje[] = new Equipaje[5];
        
        equipaje[0] = new Bodega(800.0, 100.0);
        equipaje[1] = new Bodega(3900);
        equipaje[2] = new Cabina(1250, 220.0);
        equipaje[3] = new Cabina();
        equipaje[4] = new Bodega();

        PrecioTotal solucion = new PrecioTotal(equipaje);
        
        solucion.mostrarTotales();
    }

}
