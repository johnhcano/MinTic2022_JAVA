public class ASCIIConverter extends Converter {

    public ASCIIConverter(String document) {
        super(document);
    }
    
    public String makeLine(){
        return "Hacer línea con ASCII";
    }

    public String makeParagraph(){
        return "Hacer párrafo con ASCII";
    }
    
    public String makeTable(){
        return "Hacer tabla con ASCII";
    }
}
