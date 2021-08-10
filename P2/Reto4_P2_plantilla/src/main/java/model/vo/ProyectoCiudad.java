package model.vo;

public class ProyectoCiudad {

    private String constructora;
    private String fechaInicio;
    private String clasificacion;

    public ProyectoCiudad(){
    }
    
    public ProyectoCiudad(String constructora, String fechaInicio, String clasificacion) {
        this.constructora = constructora;
        this.fechaInicio = fechaInicio;
        this.clasificacion = clasificacion;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fecha_inicio) {
        this.fechaInicio = fecha_inicio;
    }

    public String getClasificacion() {
        return clasificacion;
    }


    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
