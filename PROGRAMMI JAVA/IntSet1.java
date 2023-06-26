import java.io.*;
import java.util.*;

public class IntSet1 {

//creo una lista dove conterrò i miei oggetti/elementi
ArrayList<Integer> elements = new ArrayList<Integer>();


    public IntSet1(){} //costruttore vuoto
    
    //metodo statico che crea l'oggetto scanner e ci permette di "leggere" in input i valori messi dall'utente
    public static int getInput(){
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Enter number");
       int number = myObj.nextInt();
       myObj.close();
       return number;
    }
    
    //metodo che permette d'inserire elemnti finché non è una lettera/simbolo
        public void addElements() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers");
        try {
            while (myObj.hasNextInt()) {
                elements.add(myObj.nextInt());
            }
        } catch (Exception e) {
            System.out.println("Wrong input inserted. Closing input stream.");
        } finally {
            System.out.println(elements);
            myObj.close();
        }
    }
    
    //vari metodi
    public int choose(){
   	//tramite il costrutto try-catch gestisco l'eccezzione se la lsita è vuota 	
   		try {
   			//tramite il metodo size restituisco la lunghezza dell'array se quest'ultima è uguale a 0 "lancio" l'eccezzione riguardo
   			//al fatto che sia vuota
            if (elements.size() == 0) {
                throw new EmptyException("Cannot get element - the set is empty.");
            }
            //altrimenti verifico se l'array contiene l'elemento immesso dall'utente e lo "restituisco" se presente
            int userInput = getInput();
            if (contains(userInput)) {
                return userInput;
            } 
        }catch(EmptyException e){
            System.out.println(e);
        }
        //se non dovesse essere presente restituisco 0
        System.out.println("Could not find the value, returning 0");
        return 0;
    }
    
    //metodo che restituisce la lunghezza della lista tramite metodo di "default"
    public int size(){
    	return elements.size();
    }
    
    //metodo con parametro 
    public boolean contains(int x){
    //ciclo sulla lista e verifico se è presente il valore immesso dall'utente
 	for (int i = 0; i<elements.size(); i++) {
         if (elements.indexOf(i) == x) {
                //se presente restituisco true
                return true;
            } 
        }
        //altrimenti false
        return false;
    }
    
    public String toString(){
    //creo una variabile di tipo String "vuota"
   	String numbers = "";
        for (int i = 0; i<elements.size(); i++) {
        	//converte il valore presente nella lista in stringa ed l'assegna a numbers
            numbers += Integer.toString(elements.get(i));
            if (i+1 < elements.size()) {
                numbers += ",";
            }
        }
        return "{" + numbers + "}";
    }
    
//main del programma messo dopo tutta la definizione della classe IntSet1   
    public static void main(String[] args) {
    	
    	IntSet mySet = new IntSet();
    	
    
    	
    Scanner sc = new Scanner(System.in);
    		
    	int aa;
    	
    	do{
    		
    	System.out.println("inserisci il comando");
    	System.out.println("1) crea un insieme");
    	System.out.println("2) restituisci la lunghezza dell'insieme");
    	System.out.println("0) uscita");	
    		
    	 aa = sc.nextInt();
    	
    	switch(aa){
    		case 1:
    		System.out.println("inserisci un numero");
    		
    		mySet.addElements();
    		
    	
        break;
        	case 2:
    		
    		mySet.size();
    		
        	case 0:
        	System.out.println("Arrivederci");
        	System.exit(0);	
        break;
        	default:
        	System.out.println("input non valido");
    	}	
    		
    		
    	}while(aa != 0);
    	
    	/*
    	
    	boolean b;
        IntSet mySet = new IntSet();
        mySet.addElements();
        
        do{
        b = false;
        System.out.println("seleziona una delle seguenti funzionalità dell'insieme");
        System.out.println("1) Verifica se un valore è presente");
        System.out.println("2) Restituisce la lunghezza dell'insieme (grafico)");
        System.out.println("3) aggiungi un elemento all'insieme");
        System.out.println("4) rimuovi un elemento dell'insieme");
        System.out.println("0) exit");
        	
        System.out.println("inserisci la funzione");
        
       	
       	
        	
        switch(sc.nextInt()){
        	case 1:
        	break;
        	case 2:
        	mySet.size();
        	break;
        	case 3:
        	break;
        	case 4:
        	break;
        	default:
        		System.out.println("arrivederci");
        		b = true;
        }
        
        	
        }while(b);
        
        */
        

        
    } 
}


//creazione di classe per testare il prgramma e di classe per gestire l'eccezzione

class EmptyException extends Exception { // Creating a custom exception for handling access to an empty set
    public EmptyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}


   