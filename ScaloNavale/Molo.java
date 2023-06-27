import java.util.*;
/*
 * classe concreta che crea un molo dati tot navicargo
 */

public class Molo {
     List<NaveCargo> n;

    
    /**
     * 
     */
    public Molo(){
        n = new ArrayList<NaveCargo>();
    }

    /**
     * 
     * @param nc Nave cargo
     */
    public void attraccare(NaveCargo nc){
        n.add(nc);

    }


    /**
     * 
     * @param nc Nave Cargo
     */
    public void salpare(NaveCargo nc){
        n.remove(nc);

    }

    @Override
    public String toString() {
        Collections.reverse(n);
        return "Molo [n=" + n + "]";
    }

    


}