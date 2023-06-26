import java.util.*;
import java.io.*;

public class Test {

    public static void main(String[] args){
        
        System.out.println();

        System.out.println("CARTELLONE");
   
        System.out.println();

        Cartellone c = new Cartellone("Archipelago", 30);

        System.out.println(c);

        Programmazione s = new SingolaData(15);

        Proiezione p1 = new Proiezione("Gomorra", s);

        Programmazione r1 = new Repliche(12, 5);

        Proiezione p2 = new Proiezione("Spiderman", r1);

        c.add(p1);

        c.add(p2);

        System.out.println();

        System.out.println("PROIEZIONE");
   
        System.out.println();

        c.StampaProiezioni();

        printSchedule(r1);

    }

    private static void printSchedule(Programmazione schedule){
        for (int date : schedule) {
            System.out.println(date);
        }
        System.out.println();
    }
}