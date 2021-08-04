public class ASCIIConverter extends Converter {

    public ASCIIConverter(String id, String document) {
        super(id, document);
    }  
    
    public void makeLine(){
        System.out.println("Hacer línea ASCII");
    }

    public void makeParagraph(){
        System.out.println("Hacer párrafo ASCII");
    }

    public void makeTable(){
        System.out.println("Hacer tabla ASCII");
    }

    @Override
    public String toString() {
        return "ASCIIConverter [" + super.toString() + "]";
    }

    
}
