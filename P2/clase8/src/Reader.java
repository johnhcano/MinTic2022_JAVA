public class Reader {
    
    private String element;
    private Converter converter;
    
    public Reader(String element, Converter converter) {
        this.element = element;
        this.converter = converter;
    }

    public String getElement(){
        return element;
    }

    public void parseInput(){
        if(element.equals("1")){
            System.out.println(converter.toString());
        }else if(element.equals("2")){
            System.out.println(converter.toString());
        }else if(element.equals("3")){
            System.out.println(converter.toString());
        }else{
            System.out.println("Elemento no existe!!");
        }
    }
}
