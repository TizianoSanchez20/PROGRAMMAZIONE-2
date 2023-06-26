import java.util.Scanner;

//istanzio la classe pubblica esercizio4
public class esercizio4{

    //creo un metodo statico che come parametro prende un intero in input
    //il quale restituisce un intero questo metodo riordina i numeri in maniera decrescente 
    static int reorderNumber(int n) { 
        //converto un valore da intero a String es: 3124
        String oldNumber = Integer.toString(n);
        //poi la stringa la faccio diventare una sequenza di caratteri es: "3" + "1" + "2" + "4"
        char[] numb = oldNumber.toCharArray();
        //verifico per ogni singolo "carattere" se è maggiore di quello dopo e lo riordino
        boolean cond1 = Integer.parseInt(numb[0] + "") > Integer.parseInt(numb[1] + ""); // checking if numb[0] > numb[1]
        if (!cond1) {
            char helper = numb[0]; numb[0] = numb[1]; numb[1] = helper; // switching position 0 with 1
        } 
        boolean cond2 = Integer.parseInt(numb[2] + "") > Integer.parseInt(numb[3] + ""); // checking if numb[2] > numb[3]
        if (!cond2) {
            char helper = numb[2]; numb[2] = numb[3]; numb[3] = helper; // switching position 2 with 3
        }
        boolean cond3 = Integer.parseInt(numb[0] + "") > Integer.parseInt(numb[2] + ""); // checking if numb[0] > numb[2]
        if (!cond3) {
            char helper = numb[0]; numb[0] = numb[2]; numb[2] = helper; // switching position 0 with 2
        }
        boolean cond4 = Integer.parseInt(numb[1] + "") > Integer.parseInt(numb[3] + ""); // checking if numb[1] > numb[3]
        if (!cond4) {
            char helper = numb[1]; numb[1] = numb[3]; numb[3] = helper; // switching position 1 with 3
        }
        boolean cond5 = Integer.parseInt(numb[1] + "") > Integer.parseInt(numb[2] + ""); // checking if numb[1] > numb[2]
        if (!cond5) {
            char helper = numb[1]; numb[1] = numb[2]; numb[2] = helper; // switching position 1 with 2
        }
        //restituisco il numero riordinato in maniera decrescente come intero
        return Integer.parseInt(String.valueOf(numb));
    }

    //metto al "contrario" il numero riordinato in maniera decrescente es: 4321 ----> 1234
    static int reverseNumber(int n) {
        //converto l'intero in stringa
        String nString = Integer.toString(n);
        //creo un array di caratteri che andranno a comporre il nuovo numero
        char[] newString = {0, 0, 0, 0};
        //inizializzo la lunghezza del numero convertito in stringa
        int stringLength = nString.length();
        //assegno l'ultima posizione della stringa come prima del mio nuovo numero e così via
        newString[0] = nString.charAt(stringLength-1);
        newString[1] = nString.charAt(stringLength-2);
        newString[2] = nString.charAt(stringLength-3);
        newString[3] = nString.charAt(stringLength-4);
        //restituisco la stringa convertita in intero
        return Integer.parseInt(String.valueOf(newString));
    }

    //metodo di stampa del numero di Kaprekar
    static void printKaprekar(int n) {
        int ascendingNumber = reorderNumber(n);
        int descendingNumber = reverseNumber(ascendingNumber);
        if (ascendingNumber-descendingNumber == n) {
            return;
        }
        System.out.println(ascendingNumber-descendingNumber);
        //funzione ricorsiva
        printKaprekar(ascendingNumber-descendingNumber);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Creo l'oggetto di tipo scanner
        System.out.println("Enter number"); //chiedo all'utente d'inserire il valore
        int number = myObj.nextInt(); //metodo che prende in input il valore immesso dall'utente
        myObj.close(); //"chiude" il meto
        printKaprekar(number); //eseguo il metodo con le sue richiamate alle classi "superiori"
    }
    
}