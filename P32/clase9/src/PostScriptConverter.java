public class PostScriptConverter extends Converter {

    public PostScriptConverter(String document) {
        super(document);
    }
    
    public String makeLine(){
        return "Línea con PostScript";
    }

    public String makeParagraph(){
        return "Párrafo con PostScript";
    }

    public String makeTable(){
        return "Tabla con PostScript";
    }
}
