package P_2024_TA.Searcher;

import P_2024_TA.Classes.Figurita;

public class BuscadorMenorPrecio implements Buscador{
    private double precio;

    public BuscadorMenorPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public boolean buscar(Figurita f) {
        return f.getPrecio() < this.precio;
    }
}
