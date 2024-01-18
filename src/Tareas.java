import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tareas implements Comparable<Tareas> {

    private int prioridad;
    private int duracion;

    public Tareas(int prioridad, int duracion) {
        this.duracion = duracion;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String toString() {
        return this.prioridad + "-" + this.duracion;
    }


    @Override
    public int compareTo(Tareas other) {

        if (this.prioridad == other.prioridad) return this.duracion - other.duracion;

        return other.prioridad - this.prioridad;

    }
}




