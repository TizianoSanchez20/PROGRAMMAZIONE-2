public class Operazioni {

	private int a;
	private int b;


    public Operazioni(int a,int b) {
    	this.a = a;
    	this.b = b;
    }
    
    public int somma(int a,int b){
    	
    	int somma;
    	
    	somma = a + b;
    	
    	return somma;
    	
    	
    }
    
    public int sottrazione(int a,int b){
    	
    	int sottrazione;
    	
    	sottrazione = a - b;
    	
    	return sottrazione;
    	
    	
    }
    
    public int moltiplicazione(int a,int b){
    	
    	int moltiplicazione;
    	
    	moltiplicazione = a * b;
    	
    	return moltiplicazione;
    	
    	
    }
    
    public float divisione(int a,int b){
    	
    	float divisione;
    	    	
    	divisione = (float) a / b;
    	
    	return divisione;
    	
    	
    }
    
    
}