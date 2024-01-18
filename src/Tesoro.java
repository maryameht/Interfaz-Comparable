

public class Tesoro implements Comparable<Tesoro> {

    private int indice = 0;
    private String nombreObjeto;
    private int valorHistorico;
    private int peso;

    public Tesoro(int indice, String nombreObjeto, int valorHistorico, int peso) {

        this.nombreObjeto = nombreObjeto;
        this.valorHistorico = valorHistorico;
        this.peso = peso;

    }

    public int getIndice() {
        return this.indice;
    }

    public String getNombreObjeto() {
        return this.nombreObjeto;
    }

    public int getValorHistorico() {
        return this.valorHistorico;
    }

    public int getPeso() {
        return this.peso;
    }

    public String toString() {
        return this.nombreObjeto;
    }

    @Override
    public int compareTo(Tesoro other) {

        if (this.valorHistorico == other.valorHistorico) return other.indice - this.indice ;

        return other.valorHistorico - this.valorHistorico;
    }

}





















