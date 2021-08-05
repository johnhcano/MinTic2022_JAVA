public class App {
    public static void main(String[] args) {
        
        Converter libro = new PDFConverter("El Perfume");

        Reader reader = new Reader("1", libro);

        System.out.println(reader.parseInput());


    }
}
