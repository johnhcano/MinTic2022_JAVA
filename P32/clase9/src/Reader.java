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
        return "";
    }
    
}
