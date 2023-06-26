public class RadioGiornale extends Trasmissione{
        
        private BetaOrario durata;
        private BetaOrario orario;

        public RadioGiornale(String titolo,BetaOrario durata,BetaOrario orario){
            super(titolo);
            this.durata = durata;
            this.orario = orario;
        }
        
        public BetaOrario getDurata(){
            return durata; 
        }

        public BetaOrario getFasciaOraria(){
            return orario;

        }


        @Override
        public String toString() {
            return orario + " - " + getTitolo();
        }
        
}