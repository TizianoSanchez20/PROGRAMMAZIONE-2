import java.io.*;
import java.util.*;

//tutti i metodi devono essere statici (richiesti dalla traccia)

public class Lychrel{
    //creo un metodo statico (corretto)
    static int LychreNumbers(int numb){
    //il numero preso in input viene assegnato ad una stringa che poi invertirò
    String numberInString = Integer.toString(numb);
    //creo la stringa a cui assegnerò il numero "invertito"
    String reversedString = "";
    for (int i = 0; i < numberInString.length(); i++){
        //a reversed string assegno il carattere e "sommo" il vuoto esempio 59 diveterÃ  5 + "" e poi 9+5
      reversedString = numberInString.charAt(i) + reversedString;
    }
    //converto la stringa in un nuovo numero
    int newNumber = Integer.parseInt(reversedString);
    //restituisco la somma del numero messo in input + il suo inverso
    return newNumber+numb;


    }

    //metodo statico che restituisce un booleano true se il numero Ã¨ palindromo altrimenti false
  static boolean IsPalindrome(int numb) {
    String numberInString = Integer.toString(numb);
    //eseguo un ciclo sul numero
    for (int i = 0; i < numberInString.length(); i++) {
        //verifica la prima posizione con l'ultima perché length equivale nel nostro caso per 157 a 3 - i  che e' 0 e - 1 dobbiamo prendere il valore nella seconda posizione (Nota bene gli array partono da 0)
      if (numberInString.charAt(i) != numberInString.charAt(numberInString.length()-i-1)){
        //se diverse restituisce false
        return false;
      }
    }
    //se sono uguali il primo valore con l'ultimo sono palindrome e restituisce true
    return true;
  }

    //creo un metodo statico che conterrà tutti i numeri di Lycherel che terminerà quando troverà un numero palindromo
    //N.B. in un arraylist tra i <> devo metterci di che tipo sarà, ma la classe non quella primativa
    static ArrayList<Integer> findPalindrome(int arg) {
        //tramite costruttore creo la classe arrayt list
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        int numb = arg;
        //un ciclo while che termina quando il numero Ã¨ palindromo
        while (!IsPalindrome(numb)) {
          integerList.add(numb);
          numb = LychreNumbers(numb);
        }
        integerList.add(numb);
        return integerList;
      }

      //creo un metodo statico che inizializza un array list di numeri
      static Integer[] createListIntegers(int numb) {
        Integer[] list = new Integer[0];
        list = (findPalindrome(numb).toArray(list));
        return list;
      }

        //main del programma 
  public static void main(String[] args){
    //creo l'array list e gli assegno il numero con il quale voglio iniziare
    Integer[] list = createListIntegers(59);
    //stampo tutti i numeri prima di raggiungere il palindromo
    for (int j = 0; j<list.length; j++) {
      System.out.println(list[j]);
    }
    System.out.println("\n");
    list = new Integer[0];
    //eseguo una seconda e terza volta il procedimento
    list = createListIntegers(1709);
    for (int i = 0; i<list.length; i++) {
      System.out.println(list[i]);
    }
    System.out.println("\n");
    list = new Integer[0];
    list = createListIntegers(6174);
    for (int j = 0; j<list.length; j++) {
      System.out.println(list[j]);
    }

	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.println("Inserisci un numero");  
	while (sc.hasNextInt()) {
       list = new Integer[0];
    //eseguo una seconda e terza volta il procedimento
    list = createListIntegers(sc.nextInt());
    for (int i = 0; i<list.length; i++) {
      System.out.println(list[i]);
    }
    System.out.println("\n");
    System.out.println("Inserisci un numero"); 
    }  
    

}
}

