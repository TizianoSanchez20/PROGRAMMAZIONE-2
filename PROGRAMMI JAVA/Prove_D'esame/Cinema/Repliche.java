import java.util.Iterator;

/*
 * è una classe concreta che estende l'interfaccia programmazione e rappresenta la proiezione per più volte date le repliche
 */

public class Repliche implements Programmazione {
    private final int date;
    private final int ripetizioni;

    /**
     * Crea una programmazione che presenta un film con più repliche date in giorni consecutivi
     * @param date rappresenta la prima data in cui verrà proiettato il film
     * @param ripetizioni rappreenta quante volte verrà ritrasmesso consecutivamente
     * @throws IllegalArgumentException la data immessa nella programmazione singola non potrà essere minore di 0 oppure maggiore della data del mese
     *                                  vale anche per le ripetizioni
     */

    public Repliche(int date, int ripetizioni) {
        if (date < 0){
            throw new IllegalArgumentException("la data immessa non esiste");
        }else{
        this.date = date;
        }

        if (ripetizioni < 0){
            throw new IllegalArgumentException("la ripetizione immessa non esiste");
        }else{
        this.ripetizioni = ripetizioni;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int count = 0;
            private int d = date;

            @Override
            public boolean hasNext() {
                return count < ripetizioni;
            }

            @Override
            public Integer next() {
               
               
                count++;
                int dates = d;
                d += 1;
                return dates;
            }
        };
    }

    @Override
    public String toString() {
        return "date: " + date + ", ripetizioni=" + ripetizioni + "]";
    }

    

}