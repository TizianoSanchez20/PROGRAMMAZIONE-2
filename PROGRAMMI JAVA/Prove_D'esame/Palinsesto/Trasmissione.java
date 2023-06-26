public abstract class Trasmissione {

    private String titolo;

    public Trasmissione(String titolo){

        this.titolo = titolo;

    }

    public abstract BetaOrario getDurata();

    public abstract BetaOrario getFasciaOraria();

    public String getTitolo(){
        return titolo;
    }

    public abstract BetaOrario Conversione();

}