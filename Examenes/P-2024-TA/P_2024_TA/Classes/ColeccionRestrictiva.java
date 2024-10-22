package P_2024_TA.Classes;

import java.util.ArrayList;
import java.util.List;

import P_2024_TA.Searcher.Buscador;

public class ColeccionRestrictiva extends Coleccion{

    public ColeccionRestrictiva(String nombre, double descuento){
        super(nombre, descuento);
    }

    @Override
    public List<Figurita> getBusqueda(Buscador b) {
        return new ArrayList<>();
    }

}
