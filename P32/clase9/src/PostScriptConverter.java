public class PostScriptConverter extends Converter {

    public PostScriptConverter(String document) {
        super(document);
    }
    
    public String makeLine(){
        return "Línea con PostScript " + super.getDocument();
    }

    public String makeParagraph(){
        return "Párrafo con PostScript " + super.getDocument();
    }

    public String makeTable(){
        return "Tabla con PostScript " + super.getDocument();
    }
}
