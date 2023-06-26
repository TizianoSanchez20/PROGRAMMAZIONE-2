import java.util.*;



/**
 * è una classe concreta che rappresenta un cartellone ed è composta da un nome del cinema e dalla durata del suo mese e da tutte le sue proiezione
 */

public class Cartellone{
    public final String nome_cinema;
    public final int durata;
    private List<Proiezione> proieziones;

        /*
         * IR = il nome non può essere vuoto o null mentre la durata non può essere negativa e non può neanche essere minore di 28 o maggiore di 31
         * 
         * AF = il nome rappresenta il cinema, la durata rappresenta da quanti giorni è composto il mese infine p le proiezioni presenti
         */

    /**
     * Costruisce un cartellone che quando viene inizializzato permette di aggiungere proiezioni
     * @param nome_cinema il nome rappresenta il cinema 
     * @param durata la durata rappresenta da quanti giorni è composto
     * @throws NullPointerException se il mome del cinema è null
     * @throws IllegalArgumentException se il nome del cinema è vuoto e/o la durata è inferiore a 0 oppure minore di 28 e maggiore di 31
     */
    public Cartellone(String nome_cinema,int durata){
        if (Objects.requireNonNull(nome_cinema, "il nome non pùò essere null").isEmpty()){
            throw new IllegalArgumentException("il nome non può essere vuoto");
        }else{
            this.nome_cinema = nome_cinema;
        }
        if (durata < 0 || durata > 31 || durata < 28){
            throw new IllegalArgumentException("il mese creato non esiste");
        }else{
            this.durata = durata;
        }
        
        proieziones = new ArrayList<Proiezione>();
        
    }

    /**
     * aggiunge una trasmissione al cartellone
     * @param p rappre
     */

    public void add(Proiezione p) {
        proieziones.add(p);
    }

    /**
     * restituisce un elenco delle proiezioni date le sue date
     */
    public void elencoMese(){

    }



    /**
     * 
     */
    public void elencoSubito(){

    }


    public void StampaProiezioni(){

        for (int i = 0;i<proieziones.size();i++){

            System.out.println("Cinema: " + nome_cinema + ", " + proieziones.get(i));

        }    

    }

    @Override
    public String toString() {
        return "Cinema: " + nome_cinema + ", giorni: " + durata + ", proiezioni: " + proieziones.size();
    }

    
}