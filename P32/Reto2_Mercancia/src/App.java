public class App {
    public static void main(String[] args) {
        
        pruebaPublica1();
        pruebaPublica2();
        pruebaPrivada1();
        pruebaPrivada2();
        
    }

    public static void pruebaPublica1(){
        Mercancia mercancia[] = new Mercancia[5];
        
        mercancia[0] = new Caja(100.0, 10.0);
        mercancia[1] = new Caja(200);
        mercancia[2] = new Documento(150, 20.0);
        mercancia[3] = new Documento();
        mercancia[4] = new Caja();

        PrecioTotal solucion = new PrecioTotal(mercancia);
        solucion.mostrarTotales();
    }

    public static void pruebaPublica2(){
        Mercancia mercancia[] = new Mercancia[5];
        
        mercancia[0] = new Caja(20.0, 20.0);
        mercancia[1] = new Caja(100);
        mercancia[2] = new Documento(50, 30.0);
        mercancia[3] = new Documento();
        mercancia[4] = new Caja();

        PrecioTotal solucion = new PrecioTotal(mercancia);
        solucion.mostrarTotales();
    }

    public static void pruebaPrivada1(){
        Mercancia mercancia[] = new Mercancia[5];
        
        mercancia[0] = new Caja(50.0, 5.0);
        mercancia[1] = new Caja(10);
        mercancia[2] = new Documento(100, 10.0);
        mercancia[3] = new Documento();
        mercancia[4] = new Caja();

        PrecioTotal solucion = new PrecioTotal(mercancia);
        solucion.mostrarTotales();
    }  

    public static void pruebaPrivada2(){
        Mercancia mercancia[] = new Mercancia[5];
        
        mercancia[0] = new Caja(10.0, 2.0);
        mercancia[1] = new Caja(5);
        mercancia[2] = new Documento(50, 20.0);
        mercancia[3] = new Documento();
        mercancia[4] = new Caja();

        PrecioTotal solucion = new PrecioTotal(mercancia);
        solucion.mostrarTotales();
    }    
}
