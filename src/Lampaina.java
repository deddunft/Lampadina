public class Lampaina {

    /*
    Progettare una classe Lampadina che rappresenti una lampadina elettrica
    • La lampadina può essere accesa, spenta o rotta
    • Espone due metodi
    • stato() che indica lo stato corrente della lampadina
    • click() che cambia lo stato da accesa a spenta o da spenta
    ad accesa, oppure rompe la lampadina
    • Una lampadina si rompe dopo un numero di click
    definito dal produttore
    • La classe deve contenere uno o più campi che ne descrivano
    lo stato
    • Un costruttore
    • I metodi indicati sopra
     */
   enum lstat{
       accesa,spenta,rotta;
    }
    //att
    private lstat stato;
    private static final lstat rott= lstat.rotta;
    private int cont= 0;


    //cost
    public Lampaina (){
        this.stato = lstat.spenta;
    }

    //met

    public lstat getStato() {
        return stato;
    }

    public void setStato(lstat stato) {
        this.stato = stato;
    }
    public void click(){
        if (stato==lstat.spenta) {
            setStato(lstat.accesa);
            cont++;
        }
        else if (stato==lstat.spenta||cont>=3){
            setStato(rott);
        }
        else{
            setStato(lstat.spenta);
        }


    }

    @Override
    public String toString() {
        return "Lampaina{" +
                "stato=" + stato +
                ", cont=" + cont +
                '}';
    }
}
