import java.util.Objects;

/**
     * è una classe interna che rappresenta tot proiezione differenzate dalla sua programmazione
     */

    public class Proiezione{
    String titolo;
    Programmazione p;

    /*
         * IR = il titolo non può essere vuoto o null mentre la programmazione non può essere vuota
         * 
         * AF = il titolo rappresenta il nome della proiezioine, p rappresenta le programmazioni che si dividono in semplice,replica,periodica
         */

    /**
     * Costruisce una proiezione
     * @param titolo rappresenta il nome della proiezione
     * @param p rappresenta le programmazioni che si dividono in: semplice,replica,periodica
     * @throws NullPointerException se il mome della è null oppure la programmazione è null
     */
    public Proiezione(String titolo,Programmazione p){
        if (Objects.requireNonNull(titolo, "il nome non pùò essere null").isEmpty()){
            throw new IllegalArgumentException("il nome non può essere vuoto");
        }else{
            this.titolo = titolo;
        }

            this.p = p;
        

    }

    public String StampaPorgrammazione(Programmazione p) {
        
        String dates = new String();
        
        for (int date : p) {
            dates = String.valueOf(date);
        }
        
        return dates;

    }

    @Override
    public String toString() {
        return "titolo: " + titolo + ", " + p;
    }

    
    
}