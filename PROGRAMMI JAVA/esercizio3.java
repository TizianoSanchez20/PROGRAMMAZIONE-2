public class esercizio3 {

    //meteodo statico, il quale restituisce un effetto e nessun tipo di dato prende in input un intero
    //che equivale alla grandezza della nostra V
    static void printV(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<2*n-3-i; j++) { //2*n-3-i is the amout of spaces preceeding the second '*'
                if (i==j) { //the position of the starting '*'
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            if (i==n-1) { //aggiunge un nuovo spazio quando il programma è arrivato alla fine
                System.out.print(" ");
            }
            System.out.println("*"); //stampa l'ultimo * alla fine della linea (ciò signifa che è anche la fine del ciclo)
        }
    }

    public static void main(String[] args) {
        printV(5);
    }
}