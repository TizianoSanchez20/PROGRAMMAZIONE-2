public class NaveCargo {
private final String nome;
private final int peso;


    /**
     * @param nome nome della nave
     * @param peso peso della nave
     */
    public NaveCargo(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
        
    }


    @Override
    public String toString() {
        return  nome + "[" + peso + "]";
    }

    
    
}