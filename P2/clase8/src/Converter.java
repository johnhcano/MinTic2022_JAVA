public class Converter {
    
    private String id;
    private String document;
    
    public Converter(String id, String document) {
        this.id = id;
        this.document = document;
    }

    public String getId() {
        return id;
    }

    public String getDocument() {
        return document;
    }

    public void makeLine(){
    }

    public void makeParagraph(){
    }

    public void makeTable(){
    }

    @Override
    public String toString() {
        return "Converter [document=" + document + ", id=" + id + "]";
    }

}
