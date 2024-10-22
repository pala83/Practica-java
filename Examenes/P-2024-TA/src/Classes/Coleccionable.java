package Classes;

import java.util.List;
import Search.Buscador;

public abstract class Coleccionable {
    private String nombre;

    public Coleccionable(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();
    public abstract List<Figurita> getBusqueda(Buscador b);

}
