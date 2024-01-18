import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenarTesoro {

    public static void main(String[] args) {


        List<Tesoro> tesoros = entradaDeDatos();
        System.out.println(ordenar(tesoros));


    }

    public static List<Tesoro> entradaDeDatos () {

        //iniciamos contador de indice
        List<Tesoro> tesoros = new ArrayList<>();
        tesoros.add(new Tesoro(0, "flecha", 5, 1 ));
        tesoros.add(new Tesoro(1, "sandalias", 10, 2 ));
        tesoros.add(new Tesoro(2, "sarcofago", 1000, 1000 ));
        tesoros.add(new Tesoro(3, "mascara", 1000, 10 ));
        tesoros.add(new Tesoro(4, "arco", 2, 2 ));

        return tesoros;

    }

    public static String ordenar ( List<Tesoro> tesoros) {

        Collections.sort(tesoros);
        StringBuilder sb = new StringBuilder();
        for ( Tesoro tesoro : tesoros ) {
            sb.append(tesoro).append(" ");
        }

        return sb.toString();


    }


}

