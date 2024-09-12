package models;

public class Student {
    private String nombre;
    private int edad;
    private String[] cursos;  // Arreglo de cursos
    private int numCursos;    // Número de cursos actualmente inscritos

    // Constructor
    public Student(String nombre, int edad, int maxCursos) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursos = new String[maxCursos];  // Tamaño máximo del arreglo de cursos
        this.numCursos = 0;  // Inicialmente, el estudiante no tiene cursos
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String[] getCursos() {
        return cursos;
    }

    public int getNumCursos() {
        return numCursos;
    }

    // Metodo para agregar un curso
    public void agregarCurso(String curso) {
        if (numCursos < cursos.length) {
            cursos[numCursos] = curso;
            numCursos++;
            System.out.println("Curso " + curso + " agregado para " + nombre);
        } else {
            System.out.println("No se pueden agregar más cursos para " + nombre);
        }
    }

    // Metodo para mostrar información del estudiante
    public String toString() {
        StringBuilder info = new StringBuilder("Nombre: " + nombre + ", Edad: " + edad + ", Cursos: ");
        if (numCursos == 0) {
            info.append("Ninguno");
        } else {
            for (int i = 0; i < numCursos; i++) {
                info.append(cursos[i]);
                if (i < numCursos - 1) {
                    info.append(", ");
                }
            }
        }
        return info.toString();
    }
}
