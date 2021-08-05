import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Converter objConverter = new ASCIIConverter("Hoja de Vida");
        Reader objReader = new Reader("LINE", objConverter);
        System.out.println(objReader.parseInput());

        String[] ciudades = new String[3];
        ciudades[0] = "Cali";
        ciudades[1] = "Bogotá";
        ciudades[2] = "Barranquilla";
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Arreglo -> " + ciudades[i]);
        }

        ArrayList<String> ciudades1 = new ArrayList<>();
        ciudades1.add("Cali");
        ciudades1.add("Bogotá");
        ciudades1.add("Barranquilla");
        for (int i = 0; i < ciudades1.size(); i++) {
            System.out.println("ArrayList -> " + ciudades1.get(i));
        }
        
        ciudades1.forEach((c) -> {
            System.out.println("forEach -> " + c);
        });

        for(String c: ciudades1){
            System.out.println("for: -> " + c);
        }

    }
}
