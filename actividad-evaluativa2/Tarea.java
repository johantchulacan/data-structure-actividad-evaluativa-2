public class Tarea {
    private String id;
    private String descripcion;
    private int prioridad; // 1 = Baja, 2 = Media, 3 = Alta
    private long tiempoLlegada;


    public Tarea(String id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;

        // El Timestamp se genera aquí, pero almacenamos su valor .getTime() en long
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.tiempoLlegada = timestamp.getTime();

    }

    