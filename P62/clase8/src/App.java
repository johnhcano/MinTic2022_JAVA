import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        Converter libro = new PDFConverter("El Perfume");
        Reader reader = new Reader("1", libro);
        System.out.println("reader " + reader.parseInput());

        ArrayList<Converter> documentos =  new ArrayList<>();
        Converter excel = new ASCIIConverter("Nómina");
        Converter word = new PostScriptConverter("Carta Saludo");
        Converter ppt = new PDFConverter("Presentación");
        documentos.add(excel);
        documentos.add(word);
        documentos.add(ppt);

        Reader lector;
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite opción.."));
        switch(op){
            case 1:  
                lector = new Reader("1", documentos.get(0));
                System.out.println("lector " + lector.parseInput());
                break;
            case 2:
                lector = new Reader("2", documentos.get(1));
                System.out.println("lector " + lector.parseInput());
                break;
            case 3:
                lector = new Reader("3", documentos.get(2));
                System.out.println("lector " + lector.parseInput());
                break;
            default:
                System.out.println("Opción Incorrecta");
                break;
        }

        System.out.println("------------Explicación ArrayList VS Array----");
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
