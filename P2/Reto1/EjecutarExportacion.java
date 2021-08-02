public class EjecutarExportacion {
    
    public static void main(String[] args){
        
        Exportacion objExp = new Exportacion();
        System.out.println(objExp.compararExportacion(12, 1000, 0.10));
        System.out.println(objExp.compararExportacion(24, 2000, 0));
        System.out.println(objExp.compararExportacion(6, 3000, 0.05));
        System.out.println(objExp.compararExportacion(18, 4000, 0.5));       
    }
}
