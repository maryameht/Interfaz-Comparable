public class Regalos implements Comparable<Regalos>{

    private int nivelBueno;
    private int pesoRegalos;

    public Regalos(int nivelBueno, int pesoRegalos) {
        this.nivelBueno = nivelBueno;
        this.pesoRegalos = pesoRegalos;

    }

    public int getNivelBueno() {
        return this.nivelBueno;
    }

    public int getPesoRegalos() {
        return this.pesoRegalos;
    }

    public String toString () {
        return this.nivelBueno + " " + this.pesoRegalos;
    }

    @Override
    public int compareTo(Regalos other) {

        if (this.nivelBueno == other.nivelBueno) return this.pesoRegalos - other.pesoRegalos;

        return other.nivelBueno - this.nivelBueno;


    }


}
