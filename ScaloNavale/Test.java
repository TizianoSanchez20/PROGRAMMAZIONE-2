import java.util.*;
import java.io.*;

public class Test{
    public static void main(String[] args) {

       ScaloNavale s = new ScaloNavale();

        try (final Scanner sc = new Scanner(System.in)){
            while(sc.hasNextLine()){
                try (final Scanner line = new Scanner(sc.nextLine())) {
                    Molo p = new Molo();
                    while (line.hasNext()) {
                        NaveCargo n = new NaveCargo(line.next(), line.nextInt());
                        p.attraccare(n);
                    }

                    s.add(p);
                }
            }

        }

        System.out.println(s);


    }
}