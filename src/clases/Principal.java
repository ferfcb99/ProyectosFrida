package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("-----------Bienvenido al registro---------");
        int opcionSeleccionada = -1;
        Scanner input = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();
        while (opcionSeleccionada != 5) {
            System.out.println("Elige una opcion: ");
            System.out.println("");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Remover alumno");
            System.out.println("3. Editar alumno");
            System.out.println("4. Mostrar lista de alumnos");
            System.out.println("5. Salir");
            opcionSeleccionada = input.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    Logica logica = new Logica();
                    Object[] datos = datosAlumno();
                    Alumno alumno = logica.altaAlumno((String) datos[0], (String) datos[1], (String) datos[2], (String) datos[3], (int) datos[4], (Salon) datos[5], (Profesor) datos[6], (Semestre) datos[7], (Carrera) datos[8]);
                    if ("".equals(alumno.getMatricula()) == false) {
                        System.err.println("Registro exitoso");
                        alumnos.add(alumno);
                        // System.out.println(alumnos);                       
                    }
                    break;
                case 2:                    
                    Alumno alumnoAEliminar = obtenerPorMatricula(alumnos);
                    try{
                        alumnos.remove(alumnoAEliminar);                             
                        System.err.println("Alumno eliminado");
                    }catch(Exception e){
                        System.out.println("Error al eliminar");
                        e.printStackTrace();
                    }
                    break;
                    
                case 3:
                    Logica l = new Logica();
                    
                    try {
                        alumnos = l.editarAlumno(alumnos);
                        System.out.println("Edicion exitosa");
                    } catch (Exception e) {
                        System.out.println("Error al editar");
                    }
                    
                    break;
                case 4: 
                    muestraAlumnos(alumnos);
                    break;
                case 5:                     
                    System.out.println("Saliendo...");
                    return;
                    
                case 6: 
                    muestraDatos(alumnos);
            }

        }
    }
    
    public static void muestraDatos(List<Alumno> alumnos){
        alumnos.forEach( alumno -> {
            System.out.println(alumno.getProfesor().getNombre());
        });
    }
    
    
    public static Alumno obtenerPorMatricula(List<Alumno> alumnos){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la matricula para eliminar: ");
        String matricula = input.nextLine();
        for(Alumno alumno : alumnos){
            if(alumno.getMatricula().equals(matricula)){
                return alumno;
            }
        }
        return null;
    }
    
    public static void muestraAlumnos(List<Alumno> alumnos){
        for(Alumno alumno : alumnos){
            System.out.println(alumno.getNombre() + " - " + alumno.getMatricula());
        }
    }

    public static List<Alumno> eliminado(List<Alumno> alumnos) {
        Scanner input = new Scanner(System.in);
        String matricula = "";
        Logica l = new Logica();
        System.out.print("Ingresa la matricula del alumno a remover: ");
        matricula = input.nextLine();

        alumnos = l.bajaAlumno(matricula, alumnos);

        return alumnos;

    }

    public static Object[] datosAlumno() {
        GeneraListas generaLista = new GeneraListas();
        Scanner input = new Scanner(System.in);
        Object[] datos = new Object[9];
        System.out.println("Ingresa tu matricula");
        datos[0] = input.nextLine();
        System.out.println("Ingresa tu nombre");
        datos[1] = input.nextLine();
        System.out.println("Ingresa tu apellidoP");
        datos[2] = input.nextLine();
        System.out.println("Ingresa tu apellidoM");
        datos[3] = input.nextLine();
        System.out.println("Ingresa tu edad");
        datos[4] = input.nextInt();
        datos[5] = generaLista.seleccionaSalon(generaLista.generaSalones());
        datos[6] = generaLista.seleccionarProfesor(generaLista.generaProfesores());
        datos[7] = generaLista.seleccionarSemestre(generaLista.generaSemestres());
        datos[8] = generaLista.seleccionarCarrera(generaLista.generaCarreras());

        return datos;
    }
}
