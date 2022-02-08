
package clases;

public class Alumno{    
    private String matricula;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    
    private Salon salon;
    
    private Profesor profesor;
    
    private Semestre semestre;
    
    private Carrera carrera;

    public Alumno(String matricula, String nombre, String apellidoP, String apellidoM, int edad, Salon salon, Profesor profesor, Semestre semestre, Carrera carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.salon = salon;
        this.profesor = profesor;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public Alumno() {}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // alumno.setNombre("Juan");

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }   
}
