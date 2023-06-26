public class BetaOrario {
    protected int betaore;
    protected int betaminuti;

    public BetaOrario(int betaore,int betaminuti){
        this.betaore = betaore;
        this.betaminuti = betaminuti;

    }
    
    public BetaOrario(int betaminuti){
        this.betaminuti = betaminuti;
    }

    @Override
    public String toString(){
        return betaore + ":" + betaminuti;
    }

    

}