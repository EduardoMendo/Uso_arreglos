package models;

public class StudentRegistry {
    private Student[] estudiantes;  // Arreglo de estudiantes
    private int numEstudiantes;     // Número de estudiantes actualmente registrados

    // Constructor que inicializa el tamaño del arreglo
    public StudentRegistry(int tamaño) {
        estudiantes = new Student[tamaño];  // Inicializa el arreglo con un tamaño fijo
        numEstudiantes = 0;
    }

    // Metodo para registrar un nuevo estudiante
    public void registerStudent(Student estudiante) {
        if (numEstudiantes < estudiantes.length) {
            estudiantes[numEstudiantes] = estudiante;
            numEstudiantes++;
            System.out.println("Estudiante registrado: " + estudiante.getNombre());
        } else {
            System.out.println("No se pueden registrar más estudiantes.");
        }
    }

    // Metodo para listar todos los estudiantes inscritos
    public void listStudents() {
        if (numEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < numEstudiantes; i++) {
                System.out.println(estudiantes[i]);
            }
        }
    }

    // Metodo para agregar un curso a un estudiante específico
    public void addCourseToStudent(String nombre, String curso) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                estudiantes[i].agregarCurso(curso);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
}
