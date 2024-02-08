package domain;

import java.util.ArrayList;

public class Universidad {
    private ArrayList<Estudiante> estudiantes;

    public Universidad() {
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void imprimirPromedios() {
        System.out.println("Promedios de estudiantes:");
        for (int i = 0; i < this.estudiantes.size(); i++) {
            Estudiante estudiante = this.estudiantes.get(i);
            double promedio = estudiante.calcularPromedio();
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + ": " + promedio);
        }
    }
}
