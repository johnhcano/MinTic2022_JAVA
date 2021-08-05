public class PDFConverter extends Converter {
    
    public PDFConverter(String document) {
        super(document);
    }

    public String makeLine(){
        return "Hacer línea con PDF";
    }

    public String makeParagraph(){
        return "Hacer párrafo con PDF";
    }
    
    public String makeTable(){
        return "Hacer tabla con PDF";
    }
}
