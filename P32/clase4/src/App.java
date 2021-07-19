public class App {
    public static void main(String[] args) {
        
        /*
        // declaración e inicialización del arreglo "arr" con tamaño 5
        int arr[] = new int[5];

        arr[0] = 3;
        arr[1] = 8;
        arr[2] = 9;
        arr[3] = 7;
        arr[4] = 12;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //-----------------------Ejemplo de la creación y recorrido de una matriz
        //int m[][] = new int[3][3];
        // m[0][0] = 1;
        // m[0][1] = 2;
        int m[][] = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
            }
        }
        */

        /*
         *   Manejo de objetos dentro de un arreglo. (Arreglo de objetos) -> Computador
         */

        Computador computadores[] = new Computador[3];

        computadores[0] = new Computador("hp", 8, 256.0);
        computadores[1] = new Computador("Acer", 16, 128.0);
        computadores[2] = new Computador("Apple", 8, 256.0);

        for(int i = 0; i < computadores.length; i++){
            System.out.println(computadores[i]);
        }
        

    }
}
