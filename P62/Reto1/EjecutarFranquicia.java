public class EjecutarFranquicia {
    
    public static void main(String[] args){
        
        Franquicia objFran = new Franquicia();
        System.out.println(objFran.compararFranquicia(12, 1000, 0.10));
        System.out.println(objFran.compararFranquicia(24, 2000, 0));
        System.out.println(objFran.compararFranquicia(6, 3000, 0.05));
        System.out.println(objFran.compararFranquicia(18, 4000, 0.5));  
    }
}
