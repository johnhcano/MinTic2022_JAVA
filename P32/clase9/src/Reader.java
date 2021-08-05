public class Reader {
    
    private String element;
    private Converter converter;
    
    public Reader(String element, Converter converter) {
        this.element = element;
        this.converter = converter;
    }

    public String getElement() {
        return element;
    }

    public Converter getConverter() {
        return converter;
    }

    public String parseInput(){
        String msg = "";
        switch(element){
            case "PARAGRAPH":
                msg = converter.makeParagraph();
                break;
            case "LINE":
                msg = converter.makeLine();
                break;
            case "TABLE":
                msg = converter.makeTable();
                break;
            default:
                msg = "Selección no encontrada";
                break;
        }
        return msg;
    }
    
}
