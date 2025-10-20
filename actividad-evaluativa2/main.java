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

        gestor.modificarTarea(t1);
        Tarea t1 = set Tarea("T1", "Actualizar reporte mensual de github", 2);
        int indice = 1;
        if (indice >= 0 && indice < pila.size()) {
            pila.set(indice, "t1");
        }

        System.out.println(" tarea modificada: " + consultarEstadoTarea(t1));
    }}

    int indiceObjetivo = 2;
    String tarea = "t1";

    if(indiceObjetivo>=0&&indiceObjetivo<cola.size())
    {
        Queue<String> temp = new LinkedList<>();
        int i = 0;
        while (!cola.isEmpty()) {
            String Tarea = cola.poll();
            if (i == indiceObjetivo) {
                temp.add(modificarTarea); // reemplaza
            } else {
                temp.add(tarea);
            }
            i++;
        }
        cola = temp;
    }

    System.out.println("tarea modificada: "+ consultarEstadoTarea(t1));
    



        // Consultar estado de una tarea
        System.out.println(gestor.consultarEstadoTarea("T2"));
        System.out.println(gestor.consultarEstadoTarea("T3"));
        System.out.println(gestor.consultarEstadoTarea("T99"));
        System.out.println(gestor.consultarEstadoTarea(T1));
    