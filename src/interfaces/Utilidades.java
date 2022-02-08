
package interfaces;

import clases.*;
import java.util.List;

public interface Utilidades {
    
    public void mostrarDatos();
    
    public Alumno altaAlumno(String matricula, String nombre, String apellidoP, String apellidoM, int edad, Salon salon, Profesor profesor, Semestre semestre, Carrera carrera);
    
    public List<Alumno> bajaAlumno(String matricula, List<Alumno> alumnos);
    
    public  List<Alumno> editarAlumno(List<Alumno> alumnos);
    // public void editarAlumno(Alumno alumno);
    
    /*
    
    private int matricula;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    
    private Salon salon;
    
    private Profesor profesor;
    
    private Semestre semestre;
    
    private Carrera carrera;
    */
    
}
