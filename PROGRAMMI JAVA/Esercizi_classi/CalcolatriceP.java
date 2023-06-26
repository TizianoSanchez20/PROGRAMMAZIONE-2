import java.io.*;
import java.util.*;

public class CalcolatriceP {
        
    public static void main(String[] args) {
       
       System.out.println("inserisci la base e la sua potenza");
      
      Scanner sc = new Scanner(System.in);
      
      int base = sc.nextInt();
      
      int b = sc.nextInt();
      
      Potenza p = new Potenza(base);
      
     System.out.println("il valore dopo i calcoli è il seguente");  
       
     System.out.println(p.pow(b));
     
      System.out.println("Inserisci una nuova base");
       
      int c = sc.nextInt(); 
      	
      p.cambiobase(c);	
      
      System.out.println("il valore dopo i calcoli è il seguente");  
       
     System.out.println(p.pow(b));	
      	
       
    }
}
