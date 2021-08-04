public class PDFConverter extends Converter {

    public PDFConverter(String id, String document) {
        super(id, document);
    }
    
    public void makeLine(){
        System.out.println("Hacer línea PDF");
    }

    public void makeParagraph(){
        System.out.println("Hacer párrafo PDF");
    }

    public void makeTable(){
        System.out.println("Hacer tabla PDF");
    }

    @Override
    public String toString() {
        return "PDFConverter [" + super.toString() + "]";
    }
    
}
