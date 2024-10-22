package Search;

import Classes.Figurita;

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
