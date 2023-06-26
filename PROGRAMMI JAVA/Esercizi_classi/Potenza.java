public class Potenza {

	private int base;

    public Potenza(int base){
    	
    	this.base = base;
    	
    }
    
    public int pow(int b){
    	
    	int pow = 0;
    	
    	int i = 0;
    	
    	while(i<b){
    		
    		pow = base * base;
    		
    		i++;
    			
    	}
    	
    	
    return pow;	
    	
    	
    }
    
    public void cambiobase(int newBase){
    	
    	base = newBase;
    	
    }
    
    
}