public class PostScriptConverter extends Converter {

    public PostScriptConverter(String id, String document) {
        super(id, document);
    }
    
    public void makeLine(){
        System.out.println("Hacer línea PostScript");
    }

    public void makeParagraph(){
        System.out.println("Hacer párrafo PostScript");
    }

    public void makeTable(){
        System.out.println("Hacer tabla PostScript");
    }

    @Override
    public String toString() {
        return "PostScriptConverter [" + super.toString() + "]";
    }
}
