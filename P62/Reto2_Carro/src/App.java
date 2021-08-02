public class App {
    public static void main(String[] args) {
        
        pruebaPublica1();
        pruebaPublica2();
        pruebaPrivada1();
        pruebaPrivada2();
    }

    public static void pruebaPublica1(){
        Carro carro[] = new Carro[5];
        
        carro[0] = new Volqueta(100.0, 10.0);
        carro[1] = new Volqueta(200);
        carro[2] = new CarroNascar(150, 20.0);
        carro[3] = new CarroNascar();
        carro[4] = new Volqueta();

        PrecioTotal solucion = new PrecioTotal(carro);
        
        solucion.mostrarTotales();
    }

    public static void pruebaPublica2(){
        Carro carro[] = new Carro[5];
        
        carro[0] = new Volqueta(1000.0, 100.0);
        carro[1] = new Volqueta(2200);
        carro[2] = new CarroNascar(2150, 290.0);
        carro[3] = new CarroNascar();
        carro[4] = new Volqueta();

        PrecioTotal solucion = new PrecioTotal(carro);
        
        solucion.mostrarTotales();
    }

    public static void pruebaPrivada1(){
        Carro carro[] = new Carro[5];
        
        carro[0] = new Volqueta(2500.0, 110.0);
        carro[1] = new Volqueta(2700);
        carro[2] = new CarroNascar(1750, 720.0);
        carro[3] = new CarroNascar();
        carro[4] = new Volqueta();

        PrecioTotal solucion = new PrecioTotal(carro);
        
        solucion.mostrarTotales();
    }

    public static void pruebaPrivada2(){
        Carro carro[] = new Carro[5];
        
        carro[0] = new Volqueta(2000.0, 210.0);
        carro[1] = new Volqueta(2100);
        carro[2] = new CarroNascar(1530, 300.0);
        carro[3] = new CarroNascar();
        carro[4] = new Volqueta();

        PrecioTotal solucion = new PrecioTotal(carro);
        
        solucion.mostrarTotales();
    }

}
