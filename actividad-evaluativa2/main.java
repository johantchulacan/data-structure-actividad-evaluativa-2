public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        // Crear tareas
        Tarea t1 = new Tarea("T1", "Actualizar reporte semanal de github", 2);
        Tarea t2 = new Tarea("T2", "Notificación urgente del campus virtual", 3);
        Tarea t3 = new Tarea("T3", "Generar informe de notas", 1);
        Tarea t4 = new Tarea("T4", "ingreso calificacion a timoonel", 3);

        // Agregar tareas
        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);
        gestor.agregarTarea(t4);

        gestor.mostrarEstadoEstructuras();

        // Procesar varias tareas
        gestor.procesarSiguienteTarea();
        gestor.procesarSiguienteTarea();

        gestor.mostrarEstadoEstructuras();

        // Consultar estado de una tarea
        System.out.println(gestor.consultarEstadoTarea("T2"));
        System.out.println(gestor.consultarEstadoTarea("T3"));
        System.out.println(gestor.consultarEstadoTarea("T99"));
    }
}