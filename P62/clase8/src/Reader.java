public class Reader {
    
    private String element;
    private Converter converter;
    
    public Reader(String element, Converter converter) {
        this.element = element;
        this.converter = converter;
    }

    public String parseInput(){
        String msg = "";
        if(converter instanceof ASCIIConverter){
            msg = converter.makeLine() + converter.makeParagraph() + converter.makeTable();
        }else if(converter instanceof PostScriptConverter){
            msg = converter.makeLine() + converter.makeParagraph() + converter.makeTable();            
        }else if(converter instanceof PDFConverter){
            msg = converter.makeLine() + converter.makeParagraph() + converter.makeTable();            
        }else{
            msg = "El objeto no pertence a ninguna clase definida";
        }
        return msg;
    }
}
