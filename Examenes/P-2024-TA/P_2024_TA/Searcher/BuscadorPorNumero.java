package P_2024_TA.Searcher;

import P_2024_TA.Classes.Figurita;

public class BuscadorPorNumero implements Buscador{
    private int numero;

    public BuscadorPorNumero(int numero){
        this.numero = numero;
    }

    @Override
    public boolean buscar(Figurita f) {
        return f.getNumero() == this.numero;
    }
}
