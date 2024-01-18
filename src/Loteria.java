
//comprobar si es cierto o no :
// cuantos mas billetes comprados mayor probabilidad de que toque algo

// n : localidades analizadas
// (dinero invertido en loteria, premios ganados) < 1000000


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loteria implements Comparable<Loteria> {

    private int dineroInvertido; // cantidad de dinero invertido
    private int premio; //cantidad de premios ganados

    public Loteria (int dineroInvertido, int premio) {

        this.dineroInvertido = dineroInvertido;
        this.premio = premio;
    }

    public float getDineroInvertido () {
        return this.dineroInvertido;
    }

    public int getPremio() {
        return this.premio;
    }

    public String toString () {

        return this.dineroInvertido + "-" + this.premio;
    }


    @Override
    public int compareTo(Loteria other) {

        if (this.dineroInvertido == other.dineroInvertido) return other.premio - this.premio;

        return other.dineroInvertido - this.dineroInvertido;

    }

    public static void main(String[] args) {

        List<Loteria> loterias = entrada();
        Collections.sort(loterias);
        System.out.println(loterias);
        System.out.println("¿El reparto ha sido justo?");
        if (esJusto(loterias) == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

    public static List<Loteria> entrada () {

        List<Loteria> loterias = new ArrayList<>();
        loterias.add(new Loteria(10,5));
        loterias.add(new Loteria(20,5));
        loterias.add(new Loteria(30,5));
        //loterias.add(new Loteria(1,3));

        return loterias;

    }


    public static boolean esJusto (List<Loteria> loterias) {
        //En este método debemos mostrar si :
        // cuanto más dinero invertido más premios
        //si el dinero invertido es mayor que el del siguiente
        //y la cantidad de premios es mayor que el del siguiente
        //es justo

        Collections.sort(loterias);
        StringBuilder s = new StringBuilder();
        for ( Loteria loteria : loterias) {
            if (loteria.getDineroInvertido() > 0 ) {
                return true;
            }
        }

        return false;


    }



}
