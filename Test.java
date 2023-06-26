import java.util.*;
import java.io.*;

public class Test {

    public static void main(String[] args) {
        Palinsesto p = new Palinsesto();

        
     BetaOrario orarioFisso = new BetaOrario(9, 40);

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String dato = sc.nextLine();

            String[] dati = dato.split(" ");
            if (dati[0].equals("RADIOGIORNALE")){
                
                BetaOrario orario = new BetaOrario(Integer.valueOf(dati[1]));

                if (orario.betaminuti < 80){

                    RadioGiornale r = new RadioGiornale(dati[2], orario, orarioFisso);
                    p.add(r);
                }else{
                    System.out.println("la durata e' maggiore di un'ora");
                    System.exit(0);
                }

                
            }else if (dati[0].equals("SEMPLICE")){

                
                String[] orario = dati[1].split(":");

                

                BetaOrario inizio = new BetaOrario(Integer.valueOf(orario[0]), Integer.valueOf(orario[1]));
                BetaOrario durata = new BetaOrario(Integer.valueOf(dati[2]));
                TrasmissioneSemplice t = new TrasmissioneSemplice(dati[3], inizio, durata);

                p.add(t);

                /*BetaOrario inizio = new BetaOrario(Integer.valueOf(orario[0]), Integer.valueOf(orario[1]));

                BetaOrario durata = new BetaOrario(Integer.valueOf(dati[2]));
                TrasmissioneSemplice t = new TrasmissioneSemplice(dati[3], inizio, durata);

                p.add(t); */
                

            }else if (dati[0].equals("PERIODICA")){

                String[] orario = dati[1].split(":");

                

                BetaOrario inizio = new BetaOrario(Integer.valueOf(orario[0]), Integer.valueOf(orario[1]));
                
                BetaOrario durata = new BetaOrario(Integer.valueOf(dati[2]));
               
                int ripet = Integer.parseInt(dati[3]);
                
                BetaOrario ritrasmissione = new BetaOrario(Integer.parseInt(dati[4]));
                

                TrasmissionePeriodica per = new TrasmissionePeriodica(dati[5], inizio, durata, ripet, ritrasmissione);
                
                List<TrasmissionePeriodica> rip1 = new ArrayList<>();

        

                p.addPeriodica(p, per.ripetizioni(ripet,ritrasmissione,dati[5],per));
               
                
                

                

            }

        }

        System.out.println(p);
        

    }
}