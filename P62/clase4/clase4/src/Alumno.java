public class Alumno {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String email;

    public Alumno(int codigo, String nombre, String apellido, String email){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String matricularCurso(){
        return "Matricular cursos";
    }

    public void horario(){
        System.out.println("Horario de los cursos");
    }

    public String toString() {
        return "Cod:" + codigo + " Nombre:" + nombre + " Apellido:" + apellido + " Email:" + email;
    }

}
