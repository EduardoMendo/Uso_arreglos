package org.efmb;

import models.Student;
import models.StudentRegistry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRegistry registro = new StudentRegistry(10);  // Registro con un tamaño máximo de 10 estudiantes

        // Ejemplo de uso
        registro.registerStudent(new Student("Juan", 20, 5));  // Llamar al metodo correcto para registrar un estudiante
        registro.registerStudent(new Student("Ana", 22, 5));   // Llamar al metodo correcto para registrar un estudiante

        // Listar estudiantes
        registro.listStudents();  // Usar el metodo correcto para listar estudiantes

        // Agregar curso a un estudiante
        System.out.println("Ingrese el nombre del estudiante para agregar un curso:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el nombre del curso:");
        String curso = scanner.nextLine();

        registro.addCourseToStudent(nombre, curso);  // Usar el metodo correcto para agregar un curso

        // Listar estudiantes nuevamente
        registro.listStudents();  // Usar el metodo correcto para listar estudiantes

        scanner.close();
    }
}
