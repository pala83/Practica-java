package P_2024_TA.Searcher;

import P_2024_TA.Classes.Figurita;

public class BuscadorOR implements Buscador{
    private Buscador b1;
    private Buscador b2;

    public BuscadorOR(Buscador b1, Buscador b2){
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean buscar(Figurita f) {
        return this.b1.buscar(f) || this.b2.buscar(f);
    }
}
