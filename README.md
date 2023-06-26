# PROGRAMMAZIONE-2
Java
<br>
Documento con link e nozioni principali per java:
<br>
Sito del prof:
https://prog2.di.unimi.it/

<br>
Temi d'esame:
https://prog2unimi-temi-svolti.netlify.app/

<br>
Strutture d'uso per gli esami:
<br>
- Mappe 
- ArrayList
- LinkedList

<br>
Progettazione programma java:
- Interfaccia (presenta solo metodi vuoti)
- Classe astratta (presenta al più un metodo astratto)
- Classe concreta (extends (astratta) oppure implements (interfaccia))
- Classe interna (classe presente all'interno della classe

<br>
Eccezioni:
- NoNullExpection
- IllegalArgumentException
- OutOfBoundException

<br>
Link Tino: https://github.com/MartinWWDC/LaboratorioProgII/blob/cf498dee73b6b9854e4169dfec318d1bee06b3b1/Esercizi/testi-SecondoSemestre/Simulazioni/Patagon/README.md

<br>
Un iteratore è un oggetto che consente di accedere sequenzialmente agli elementi di una collezione, senza la necessità di conoscerne la struttura o l'implementazione sottostante. In altre parole, un iteratore fornisce un'interfaccia per eseguire l'iterazione su una collezione.

Per implementare un iteratore, è necessario seguire alcune fasi:

Creare una classe che rappresenti l'iteratore. Questa classe dovrebbe avere un riferimento alla collezione su cui si sta iterando e mantenere lo stato corrente dell'iterazione.

Implementare almeno due metodi: uno per ottenere l'elemento successivo nella sequenza (ad esempio next()), e un altro per verificare se ci sono ancora elementi disponibili (ad esempio hasNext()).

Nel metodo next(), è necessario restituire il prossimo elemento nella sequenza e spostare lo stato corrente dell'iterazione in avanti.

Nel metodo hasNext(), è necessario controllare se ci sono ancora elementi disponibili nella sequenza. Se sì, restituirà true; altrimenti, restituirà false.

All'interno della classe della collezione, è necessario implementare un metodo per restituire un'istanza dell'iteratore, ad esempio getIterator(), che restituirà un nuovo oggetto iteratore ogni volta che viene chiamato.

Ecco un esempio di implementazione di un iteratore in linguaggio Java:

import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {
    private int[] elements;

    public MyCollection(int[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.length;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                int element = elements[index];
                index++;
                return element;
            }
            return null;
        }
    }
}
In questo esempio, MyCollection rappresenta la collezione su cui si desidera eseguire l'iterazione. Implementa l'interfaccia Iterable, che richiede l'implementazione di un metodo iterator() che restituisce un'istanza dell'iteratore.

La classe interna MyIterator implementa l'interfaccia Iterator, fornendo l'implementazione dei metodi hasNext() e next(). hasNext() controlla se ci sono ancora elementi disponibili nella sequenza, mentre next() restituisce il prossimo elemento nella sequenza e sposta lo stato corrente dell'iterazione in avanti.

Infine, quando si desidera iterare sulla collezione MyCollection, è possibile utilizzare un ciclo for-each o un ciclo while insieme al metodo iterator() per ottenere un'istanza dell'iteratore e accedere sequenzialmente agli elementi della collezione:

int[] elements = {1, 2, 3, 4, 5};
MyCollection collection = new MyCollection(elements);

for (int element : collection) {
    System.out.println(element);
}
Questo esempio stamperebbe tutti gli elementi della collezione uno alla volta.

<br>

https://github.com/Parmalatte/Programmazione-II.git




