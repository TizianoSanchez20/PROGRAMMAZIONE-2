import java.util.ArrayList;
import java.util.List;

/*
 * è una classe concreta che rappresenta uno scalo navale con i suoi moli e navi cargo dal quale è composto
 */

public class ScaloNavale{
 List<Molo> moli;

    /*
     * costruttore di ScaloNavale
     */
    public ScaloNavale(){


        moli = new ArrayList<Molo>();


    }

        /**
         * 
         * @param m il molo che verrà aggiunto allo scale navale
         * @return scalo navale
         */
    public void add(Molo m){

        moli.add(m);

    }

        @Override
        public String toString() {
            return "ScaloNavale [moli=" + moli + "]";
        }

    





}