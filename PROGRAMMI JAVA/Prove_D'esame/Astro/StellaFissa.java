public class StellaFissa extends CorpoCeleste{

    private final Punto posizione;

    public StellaFissa(char tipo, String nome,Punto posizione){
        super(tipo, nome);
        this.posizione = posizione;
    }

    public long calcolaEnergia(Punto poszione,Punto velocita){

        long energia = (posizione.norma() * velocita.norma());

        return energia; 

    }
    
}