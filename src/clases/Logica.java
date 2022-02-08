package clases;

import interfaces.Utilidades;
import java.util.List;
import java.util.Scanner;

public class Logica implements Utilidades {

    @Override
    public void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno altaAlumno(String matricula, String nombre, String apellidoP, String apellidoM, int edad, Salon salon, Profesor profesor, Semestre semestre, Carrera carrera) {
        Alumno alumno = new Alumno(matricula, nombre, apellidoP, apellidoM, edad, salon, profesor, semestre, carrera);
        return alumno;
    }

    @Override
    public List<Alumno> bajaAlumno(String matricula, List<Alumno> alumnos) {
        // remove("Pedro")
        Alumno alumno = new Alumno();

        for (Alumno alumnoActual : alumnos) {
            if (alumnoActual.getMatricula() == matricula) {
                alumno = new Alumno(alumnoActual.getMatricula(), alumnoActual.getNombre(), alumnoActual.getApellidoP(), alumnoActual.getApellidoM(), alumnoActual.getEdad(), alumnoActual.getSalon(), alumnoActual.getProfesor(), alumnoActual.getSemestre(), alumnoActual.getCarrera());
            }
        }
        alumnos.remove(alumno);
        return alumnos;
    }

    @Override
    public List<Alumno> editarAlumno(List<Alumno> alumnos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la matricula del alumno a editar: ");
        String matricula = input.nextLine();
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                System.out.println("Ingresa el nombre");
                String nombre = input.nextLine();
                alumno.setNombre(nombre);
                System.out.println("Ingresa el apellido paterno");
                String apellidoP = input.nextLine();
                alumno.setApellidoP(apellidoP);
                System.out.println("Ingresa el apellido materno");
                String apellidoM = input.nextLine();
                alumno.setApellidoM(apellidoM);
                System.out.println("Ingresa el edad");
                int edad = input.nextInt();
                alumno.setEdad(edad);
                break;
            }
        }
        return alumnos;
    }

}
