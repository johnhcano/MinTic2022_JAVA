/**
 *  Universidad Tecnologica de Pereira <br>
 *  (Pereira, Risaralda - Colombia) 
 *  */
//package utp.misiontic2022.c2.mundo;

/**
 * Clase que representa un Proyecto.
 */
public class Exportacion {

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del proyecto.
     */
	private String proyecto;

	/**
     * Valor del tiempo.
     */
    private int tiempo;
    
    /**
     * Valor del capital.
     */
    private double capital;
	
    /**
     * Tasa de interés efectiva mensual del proyecto 
     */
    private double interes;
	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye el proyecto. <br>
     * <b>post: </b> Se creó un nuevo proyecto con los siguientes valores: <br>
     * Proyecto: UTP.
     */
	public Exportacion()
    {
		proyecto = "UTP Ciclo 2 Java";  
		tiempo = 0;
        capital = 0;
        interes = 0;
    }
	
	/**
     * Retorna el nombre del proyecto.
     * @return Nombre del proyecto.
     */
    public String getNombreProyecto()
    {
        return proyecto;
    }

	/**
     * Retorna el interes simple, monto, capital en una cadena de texto.
     * @return El total de interes simples generados en número.
     */
    public double calcularInteresSimple( )
    {
        double interesSimple = capital * interes * tiempo;
        return interesSimple;
    }
    
    /**
     * Retorna el interes compuesto, monto, capital en una cadena de texto.
     * @return El total de interes compuestos generados en número.
     */
    public double calcularInteresCompuesto( )
    {
        double interesCompuesto = capital * ( Math.pow( 1 + interes, tiempo ) - 1);
        return interesCompuesto;
    }
    
    /**
     * Método para comparar la diferencia en el total de intereses generados para el proyecto.
     * @return Respuesta al Reto.
     */
    public String compararExportacion (int pTiempo, double pCapital, double pInteres)
    {
    	tiempo = pTiempo;
        capital = pCapital;
        interes = pInteres;
        
        /* Cálculo de la diferencia entre tipos de tasas */
    	double respuesta = calcularInteresCompuesto( ) - calcularInteresSimple( );
    	
    	if ( respuesta > 0 )
        {    		
        	return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta;  
        }
    	else 
	    {    		        	
        	return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
	    }
    	
    }
	
}