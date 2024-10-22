package P_2024_TA.Searcher;

import P_2024_TA.Classes.Figurita;

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
