package org.kyfd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ControlAsistencias {

    private Map<String, List<Asistencia>> registroAsistencias;

    private class Asistencia {
        private String fecha;
        private String estudiante;
        private String estado;

        public Asistencia(String fecha, String estudiante, String estado) {
            this.fecha = fecha;
            this.estudiante = estudiante;
            this.estado = estado;
        }

        public String getFecha() {
            return fecha;
        }

        public String getEstudiante() {
            return estudiante;
        }

        public String getEstado() {
            return estado;
        }

        public String toString() {
            return "Fecha: " + fecha + ", Estudiante: " + estudiante + ", Estado: " + estado;
        }
    }

    public ControlAsistencias() {
        this.registroAsistencias = new HashMap<>();
    }

    // metodo para marcar la asistencia de un estudiante
    public void marcarAsistencia(String fecha, String estudiante, String estado) {
        // Validar que el estado sea "Presente" o "Ausente"
        if (!estado.equalsIgnoreCase("Presente") && !estado.equalsIgnoreCase("Ausente")) {
            throw new IllegalArgumentException("El estado debe ser 'Presente' o 'Ausente'");
        }

        Asistencia asistencia = new Asistencia(fecha, estudiante, estado);

        // Verificar si ya existe un registro para la fecha
        if (!registroAsistencias.containsKey(fecha)) {
            registroAsistencias.put(fecha, new ArrayList<>());
        }


        registroAsistencias.get(fecha).add(asistencia);
    }

    // metodo para generar un reporte de asistencia
    public void generarReporte() {
        for (Map.Entry<String, List<Asistencia>> entry : registroAsistencias.entrySet()) {
            String fecha = entry.getKey();
            List<Asistencia> asistencias = entry.getValue();
            System.out.println("Fecha: " + fecha);
            for (Asistencia asistencia : asistencias) {
                System.out.println(asistencia);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ControlAsistencias control = new ControlAsistencias();

        control.marcarAsistencia("2024-09-12", "kevin Fittoria", "Presente");
        control.marcarAsistencia("2024-09-12", "Eduardo Mendoza", "Ausente");
        control.marcarAsistencia("2024-09-12", "Angel Moreno", "Presente");

        control.generarReporte();
    }
}
