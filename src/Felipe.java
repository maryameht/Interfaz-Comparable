import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Felipe {
    public static void main(String[] args) {

        List<Tareas> entradas = entradaDeDatos();
        System.out.println(entradas);
        System.out.println(ordenar(entradas));
        System.out.println("---");


    }
    public static List<Tareas> entradaDeDatos() {

        List<Tareas> entradas = new ArrayList<>();
        entradas.add(new Tareas(1, 6));
        entradas.add(new Tareas(2, 4));
        entradas.add(new Tareas(3, 5));

        return entradas;

    }

    public static String ordenar (List<Tareas> entradas) {

        //ordenar entradas
        Collections.sort(entradas);
        //creo un constructor de string llamado s
        StringBuilder s = new StringBuilder();
        //me recorro cada una de las tareas
        for ( Tareas tarea  : entradas ) {
            //para cada tarea que encuentres, concatenamela y haz un salto de linea
            s.append(tarea).append("\n");
        }
        return s.toString();



    }


}
