import java.util.Iterator;

/*
 * è una classe concreta che estende l'interfaccia programmazione e rappresenta la proiezione per una singola data
 */

public class SingolaData implements Programmazione{
    private int date;

    /**
     * Creazione di una porgrammazione a data singola
     * @param date
     * @throws NullPointerException se la data è null
     * @throws IllegalArgumentException la data immessa nella programmazione singola non potrà essere minore di 0 oppure maggiore della data del mese
     *                                  oppure null
     */
    public SingolaData(int date) {
        if (date < 0){
            throw new IllegalArgumentException("la data immessa non esiste");
        }else{
        this.date = date;
        }
        
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private boolean hasNext = true;

            @Override
            public boolean hasNext() {
                return hasNext;
            }

            @Override
            public Integer next() {
                hasNext = false;
                return date;
            }
        };
    }

    @Override
    public String toString() {
        return "date: " + date;
    }

    
}