import java.io.*;
import java.util.*;

public class Calcolatrice{

	public static void main(String[] args) {
      
      System.out.println("inserisci due valori");
      
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      
      int b = sc.nextInt();
     	
      Operazioni o = new Operazioni(a,b);
      
      System.out.println("Somma");
      
      System.out.println(o.somma(a,b));
      
      System.out.println("Sottrazione");
      
      System.out.println(o.sottrazione(a,b));
      
      System.out.println("Moltiplicazione");
      
      System.out.println(o.moltiplicazione(a,b));
      
      System.out.println("Divisione");	

	  System.out.println(o.divisione(a,b));

}	

	
}


