public class Modelo {
    
    private int numeroUno;
    private int numeroDos;
    private int resultado;
    
    public int getNumeroUno() {
        return numeroUno;
    }
    
    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }
    
    public int getNumeroDos() {
        return numeroDos;
    }
    
    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }
    
    public int getResultado() {
        return resultado;
    }
    
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int sumar(){
        resultado = numeroUno + numeroDos;
        return resultado;
    }
}
