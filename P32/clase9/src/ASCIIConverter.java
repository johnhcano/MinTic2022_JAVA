public class ASCIIConverter extends Converter {

    public ASCIIConverter(String document) {
        super(document);
    }

    public String makeLine(){
        return "Línea con ASCII";
    }

    public String makeParagraph(){
        return "Párrafo con ASCII";
    }

    public String makeTable(){
        return "Tabla con ASCII";
    }

}
