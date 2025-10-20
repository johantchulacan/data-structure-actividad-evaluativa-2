public class GestorTareas {

    private Queue<Tarea> colaEspera;       // FIFO → tareas normales
    private Stack<Tarea> pilaPrioritaria;  // LIFO → tareas urgentes
    private Map<String, String> registro;  // id → estado y tiempo

    public GestorTareas() {
        colaEspera = new LinkedList<>();
        pilaPrioritaria = new Stack<>();
        registro = new HashMap<>();
    }
}

 // 4.1 Agregar tarea según prioridad
    public void agregarTarea(Tarea tarea) {
        if (tarea.getPrioridad() == 3) {
            pilaPrioritaria.push(tarea);
            System.out.println("Tarea de alta prioridad agregada a la pila: " + tarea.getId());
        } else {
            colaEspera.offer(tarea);
            System.out.println("Tarea agregada a la cola: " + tarea.getId());
        }
    }

    // 4.2 Procesar la siguiente tarea
    public Tarea procesarSiguienteTarea() {
        Tarea tareaProcesada = null;

        if (!pilaPrioritaria.isEmpty()) {
            tareaProcesada = pilaPrioritaria.pop();
            System.out.println("Procesando tarea urgente (pila): " + tareaProcesada.getId());
        } else if (!colaEspera.isEmpty()) {
            tareaProcesada = colaEspera.poll();
            System.out.println("Procesando tarea normal (cola): " + tareaProcesada.getId());
        } else {
            System.out.println("No hay tareas pendientes.");
            return null;
        }

        // Registrar en el mapa de trazabilidad
        long tiempoFinal = System.currentTimeMillis();
        registro.put(tareaProcesada.getId(),
                "Completada (procesada a las " + tiempoFinal + ")");
        return tareaProcesada;
    }

    // 4.3 Consultar estado por ID
    public String consultarEstadoTarea(String idTarea) {
        if (registro.containsKey(idTarea)) {
            return "Tarea " + idTarea + ": Completada ";
        }

        // Buscar en la pila (urgentes pendientes)
        for (Tarea t : pilaPrioritaria) {
            if (t.getId().equals(idTarea)) {
                return "Tarea " + idTarea + ": Pendiente (Alta prioridad)";
            }
        }

        // Buscar en la cola (normales pendientes)
        for (Tarea t : colaEspera) {
            if (t.getId().equals(idTarea)) {
                return "Tarea " + idTarea + ": Pendiente (En cola)";
            }
        }

        return "ID no encontrado ";
    }

    // Método auxiliar para mostrar estado de estructuras
    public void mostrarEstadoEstructuras() {
        System.out.println("\n--- Estado actual ---");
        System.out.println("Pila Prioritaria: " + pilaPrioritaria);
        System.out.println("Cola de Espera: " + colaEspera);
        System.out.println("Registro de Trazabilidad: " + registro.keySet());
    }
}