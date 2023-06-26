public class TrasmissioneSemplice extends Trasmissione{
        private BetaOrario orario;
        private BetaOrario durata;

        public TrasmissioneSemplice(String titolo,BetaOrario orario,BetaOrario durata){
            super(titolo);
            this.orario = orario;
            this.durata = durata;
        }

        public BetaOrario getFasciaOraria(BetaOrario orario,BetaOrario durata){
            BetaOrario orarionuovo = new BetaOrario(0, 0);

            if ((orario.minuti + durata) > 80){

                orarionuovo.betaore = orarionuovo.betaore + ((orario.minuti + durata)/80);
                orarionuovo.betaminuti = ((orario.minuti + durata)%80);


            }

            return orarionuovo;
        }

        @Override
        public String toString() {
            return orario + " - " + getTitolo();
        }

        


        

}