public class App {
    public static void main(String[] args) {
        
        Converter objConverter = new ASCIIConverter("Hoja de Vida");

        Reader objReader = new Reader("LINE", objConverter);

        System.out.println(objReader.parseInput());
        
    }
}
