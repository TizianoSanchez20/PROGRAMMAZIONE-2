import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
    
    Punto p = new Punto(1, -2, 3);
    System.out.println(p);

    Punto q = new Punto(7, -8, 10);
    System.out.println(q);

    Punto k = p.somma(q);
    System.out.println(k);

    Punto l = p.sottrai(q);
    System.out.println(k);

    int assoluto = k.norma();
    System.out.println(assoluto);


}

    
}
