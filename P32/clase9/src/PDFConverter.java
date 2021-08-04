public class PDFConverter extends Converter {

    public PDFConverter(String document) {
        super(document);
    }
    
    public String makeLine(){
        return "Línea con PDF";
    }

    public String makeParagraph(){
        return "Párrafo con PDF";
    }

    public String makeTable(){
        return "Tabla con PDF";
    }
}
