package Search;

import Classes.Figurita;

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
