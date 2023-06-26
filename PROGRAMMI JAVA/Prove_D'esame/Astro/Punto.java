/**
 OVERVIEW= creiamo un  punto tridimensionale
 */

public class Punto {

    private int x;
    private int y;
    private int z;

    /**
     * 
     * @param x
     * @param y
     * @param z
     */

    public Punto(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    } 

    /**
     * 
     * @param q
     * @return
     */

    public Punto somma(Punto q){
        this.x = (this.x+q.x);
        this.y = (this.y+q.y);
        this.z = (this.z+q.z);

        Punto k = new Punto(this.x, this.y, this.z);
        return k;
    }

    /**
     * 
     * @param q
     * @return
     */

    Punto sottrai(Punto q){
        this.x = (this.x-q.x);
        this.y = (this.y-q.y);
        this.z = (this.z-q.z);

        Punto k = new Punto(this.x, this.y, this.z);

        return k;
    }

    /**
     * 
     * @return
     */

    public int norma(){

        int somma; 

        if (this.x < 0){
            this.x = this.x * -1;
        }

        if (this.y < 0){
            this.y = this.y * -1;
        }

        if (this.z < 0){
            this.z = this.z * -1;
        }

        somma = this.x + this.y + this.z;

        return somma; 

    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    
}