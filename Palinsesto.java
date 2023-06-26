import java.util.ArrayList;
import java.util.List;

public class Palinsesto {
    private List<Trasmissione> trasmissiones;

    public Palinsesto(){

        trasmissiones = new ArrayList<Trasmissione>();

    }

    public void add(Trasmissione t) {
        trasmissiones.add(t);
    }

    public void remove(Trasmissione t) {
        trasmissiones.remove(t);
    }

    public void riordina(Trasmissione t,Trasmissione t1){

    }

    public Palinsesto addPeriodica(Palinsesto p, List<TrasmissionePeriodica> rip){

            for(int i = 0; i < rip.length;i++){

                p = p.add(rip.get(i));


            }

            return p;

        }

    @Override
    public String toString() {
        return "Palinsesto [trasmissiones=" + trasmissiones + "]";
    }

   
   
}