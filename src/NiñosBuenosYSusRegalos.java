
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class NiñosBuenosYSusRegalos {
    public static void main(String[] args) {

        List<Regalos> entradas = entradaDeDatos();
        System.out.println(ordenar(entradas));

    }

    public static List<Regalos> entradaDeDatos () {

        List<Regalos> entradas = new ArrayList<>();
        entradas.add(new Regalos(80, 2));
        entradas.add(new Regalos(100, 12));
        entradas.add(new Regalos(100, 1));

        entradas = new ArrayList<>();
        entradas.add(new Regalos(1,1));
        entradas.add(new Regalos(1,1));


        return entradas;

    }

    public static String ordenar (List<Regalos> entradas ) {

        Collections.sort(entradas);

        StringBuilder s = new StringBuilder();
        for ( Regalos regalo: entradas ) {
            s.append(regalo).append('\n');
        }
        return s.toString();
    }


}
