
package clases;


public class Profesor {
    
    private int idProfesor;
    private String nombre;
    private String apellidoP;    
    // implementar herencia para la especialidad

    public Profesor(int idProfesor, String nombre, String apellidoP) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
    }
    
    public Profesor(int idProfesor, String nombre) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;        
    }

    public Profesor() {
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    
}
