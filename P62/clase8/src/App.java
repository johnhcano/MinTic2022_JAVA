import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Converter libro = new PDFConverter("El Perfume");
        Reader reader = new Reader("1", libro);
        System.out.println(reader.parseInput());

        System.out.println("----------------");
        //ArrayList<Converter> documentos =  new ArrayList<>();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("AL -> Jhon");
        nombres.add("AL -> Byron");
        nombres.add("AL -> Harvin");
        for(int i = 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        nombres.forEach((names) -> {
            System.out.println(names);
        });

        for(String names: nombres){
            System.out.println(names);
        }

        System.out.println("----------------");

        String[] personas = new String[3];
        personas[0] = "A -> Jhon";
        personas[1] = "A -> Byron";
        personas[2] = "A -> Harvin";
        for(int i = 0; i < personas.length; i++){
            System.out.println(personas[i]);
        }


    }
}
