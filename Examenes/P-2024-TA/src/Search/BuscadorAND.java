package Search;

import Classes.Figurita;

public class BuscadorAND implements Buscador{
    private Buscador b1;
    private Buscador b2;

    public BuscadorAND(Buscador b1, Buscador b2){
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean buscar(Figurita f) {
        return this.b1.buscar(f) && this.b2.buscar(f);
    }
}
