import java.io.*;
import java.util.*;

public class esercizio2{
    //creo un metodo statico che converte un intero in stringa
    static String numberToString(int numb) {
        return Integer.toString(numb);
    }

    /** sommo ogni singolo carattere del numero
     * @param numb prende in input un intero
     * @return la somma in forma di stringa
    */
    static String sumStringNumbers(String numb) {
        int sum = 0;
        for (int i = 0; i<numb.length(); i++) {
            sum += (Integer.parseInt(String.valueOf(numb.charAt(i))));
        }
        //se la somma è maggiore di 9 eseguo di nuovo il metodo (quindi in parte è ricorsivo)
        if (sum > 9) {
            return sumStringNumbers(numberToString(sum));
        }
        return numberToString(sum);
    }

    /**eseguo prima la moltiplicazione poi richiamo il metodo somma già definito. 
     * @param numb1 è un intero
     * @param numb2 è un altro intero
     * @return la somma in forma di stringa.
    */
    static String productIntegers(int numb1, int numb2) {
        return sumStringNumbers(numberToString(numb1*numb2));
    }

    /** sommo due "stringhe" d'interi  
     * @param numb1 è un intero
     * @param numb2 è un altro intero
     * @return la somma sotto forma di stringa.
    */
    static String productStrings(String numb1, String numb2) {
        return sumStringNumbers(numberToString(Integer.parseInt(numb1)*Integer.parseInt(numb2)));
    }

    /** It checks if a set of factors passes the 'Casting out Nine' test but gives a wrong product. 
     * @param numb an integer, which will be the upper limit for the factors and the product.
     * 
    */
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    		
    	System.out.println("inserisci un numero");	
    		
    	int aa = sc.nextInt();
    	
    		for (int i = 0; i<aa; i++) {
            String a = sumStringNumbers(Integer.toString(i));
            for (int j = 0; j<aa; j++) {
                String b = sumStringNumbers(Integer.toString(j));
                String AxB = productStrings(a, b); 
                String c = productIntegers(i, j); 
                if (AxB.equals(c) && !c.equals(Integer.toString(i*j)) && Integer.parseInt(c) < aa) {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    	           
       
        
    }
}