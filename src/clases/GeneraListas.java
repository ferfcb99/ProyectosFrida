package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneraListas {

    // List->ArrayList ("Juan","")
    Scanner input = new Scanner(System.in);

    public List<Salon> generaSalones() {

        List<Salon> salones = new ArrayList<>();

        salones.add(new Salon(1, "Salon 1"));
        salones.add(new Salon(2, "Salon 2"));
        salones.add(new Salon(3, "Salon 3"));
        salones.add(new Salon(4, "Salon 4"));

        return salones;
    }

    public Salon seleccionaSalon(List<Salon> salones) {

        for (Salon salon : salones) {
            System.out.println(salon.getIdSalon() + " - " + salon.getNombreSalon());
        }
        System.out.println("Ingresa el numero de salon que quieres tomar: ");
        int salonSeleccionado = this.input.nextInt();

        for (Salon salon : salones) {
            if (salonSeleccionado == salon.getIdSalon()) {
                return salon;
            }
        }
        return null;
    }

    public List<Profesor> generaProfesores() {

        List<Profesor> profesores = new ArrayList<>();

        profesores.add(new Profesor(1, "Saul", "Gomez"));
        profesores.add(new Profesor(2, "Lizbeth", "valverde"));
        profesores.add(new Profesor(3, "Raul"));

        return profesores;
    }

    public Profesor seleccionarProfesor(List<Profesor> profesores) {

        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + " - " + profesor.getApellidoP() + " : " + profesor.getIdProfesor());
        }
        System.out.println("Ingresa el profesor con el quieres tomar clases: ");
        int profesorSeleccionado = this.input.nextInt();

        for (Profesor profesor : profesores) {
            if (profesorSeleccionado == profesor.getIdProfesor()) {
                return profesor;
            }
        }
        return null;
    }

    public List<Carrera> generaCarreras() {

        List<Carrera> carreras = new ArrayList<>();

        carreras.add(new Carrera(1, "Ingenieria civil"));
        carreras.add(new Carrera(2, "Medicina"));
        carreras.add(new Carrera(3, "Matematicas"));
        carreras.add(new Carrera(4, "Administracion"));

        return carreras;
    }

    public Carrera seleccionarCarrera(List<Carrera> carreras) {

        for (Carrera carrera : carreras) {
            System.out.println(carrera.getIdCarrera() + " - " + carrera.getNombre());
        }
        System.out.println("Ingresa la carrera que deseas cursar: ");
        int carreraSeleccionada = this.input.nextInt();

        for (Carrera carrera : carreras) {
            if (carreraSeleccionada == carrera.getIdCarrera()) {
                return carrera;
            }
        }
        return null;
    }

    public List<Semestre> generaSemestres() {

        List<Semestre> semestres = new ArrayList<>();

        semestres.add(new Semestre(1, "Primero"));
        semestres.add(new Semestre(2, "Segundo"));
        semestres.add(new Semestre(3, "Tercero"));
        semestres.add(new Semestre(4, "Cuarto"));

        return semestres;
    }

    public Semestre seleccionarSemestre(List<Semestre> semestres) {

        for (Semestre semestre : semestres) {
            System.out.println(semestre.getNo() + " - " + semestre.getDescripcion());
        }
        System.out.println("Ingresa el semestre a partir del cual te inscribes: ");
        int semestreSeleccionado = this.input.nextInt();

        for (Semestre semestre : semestres) {
            if (semestreSeleccionado == semestre.getNo()) {
                return semestre;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GeneraListas g = new GeneraListas();
        System.out.println(g.seleccionarCarrera(g.generaCarreras()).getNombre());
    }

}
