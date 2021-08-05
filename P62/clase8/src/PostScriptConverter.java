public class PostScriptConverter extends Converter {

    public PostScriptConverter(String document) {
        super(document);
    }

    public String makeLine(){
        return "Hacer línea con PostScript";
    }

    public String makeParagraph(){
        return "Hacer párrafo con PostScript";
    }
    
    public String makeTable(){
        return "Hacer tabla con PostScript";
    }
    
}
