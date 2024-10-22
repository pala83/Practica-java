package Classes;

import java.util.ArrayList;
import java.util.List;

import Search.Buscador;

public class ColeccionRestrictiva extends Coleccion{

    public ColeccionRestrictiva(String nombre, double descuento){
        super(nombre, descuento);
    }

    @Override
    public List<Figurita> getBusqueda(Buscador b) {
        return new ArrayList<>();
    }

}
