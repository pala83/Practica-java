package Search;

import Classes.Figurita;

public class BuscadorNOT implements Buscador{
    private Buscador b;
    
    public BuscadorNOT(Buscador b){
        this.b = b;
    }

    @Override
    public boolean buscar(Figurita f) {
        return !b.buscar(f);
    }
}
