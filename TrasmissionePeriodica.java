import java.util.ArrayList;
import java.util.List;

public class TrasmissionePeriodica extends Trasmissione{
        private BetaOrario orario;
        private BetaOrario durata;
        private int ripetizioni;
        private BetaOrario ritrasmissione;

        public TrasmissionePeriodica(String titolo,BetaOrario orario,BetaOrario durata,int ripetizioni,BetaOrario ritrasmissione){
            super(titolo);
            this.orario = orario;
            this.durata = durata;
            this.ripetizioni = ripetizioni;
            this.ritrasmissione = ritrasmissione;
        }


        public TrasmissionePeriodica(String titolo,BetaOrario ritrasmissione){
            super(titolo);
            this.ritrasmissione = ritrasmissione;
        }

        public BetaOrario Conversione(BetaOrario orario,BetaOrario ritrasmissione){

            BetaOrario nuovo;

            if (ritrasmissione.minuti > 79){

                nuovo.betaore = ritrasmissione.minuti/80;
                nuovo.betaminuti = ritrasmissione.minuti%80;

            }else{

                orario.betaminuti = orario.betaminuti + ritrasmissione.minuti;

                return orario;

            }

            orario.betaore = orario.betaore + nuovo.betaore;
            orario.betaminuti = orario.betaminuti + nuovo.betaminuti;

            return orario;

        }


        public List<TrasmissionePeriodica> ripetizioni(int ciclo,BetaOrario ritrasmissione,String titolo,TrasmissionePeriodica p){

            List<TrasmissionePeriodica> rip = new ArrayList<>();
            TrasmissionePeriodica p1 = p;

                for (int i = 0;i<ciclo;i++){
                    
                    if (i == 0){
                        rip.add(i,p);
                    }else{

                        BetaOrario nuovo = p.Conversione(p1.orario,ritrasmissione); 
                        
                        TrasmissionePeriodica p2 = new TrasmissionePeriodica(titolo,nuovo);

                        rip.add(i,p2);

                    }

                    

                }

                return rip;

        }


         @Override
        public String toString() {
            return orario + " - " + getTitolo();
        }



        

}