package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Search.Buscador;

public class Coleccion extends Coleccionable{
    private List<Coleccionable> colecciones;
    private double descuento; // se considera el % de descuento como un valor entre 0 y 1

    public Coleccion(String nombre, double descuento){
        super(nombre);
        this.descuento = descuento;
        this.colecciones = new ArrayList<>();
    }

    public void addColeccion(Coleccionable nueva){
        this.colecciones.add(nueva);
    }

    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for(Coleccionable c: this.colecciones)
            total+=c.getPrecio();
        return total-total*this.descuento;
    }

    @Override
    public List<Figurita> getBusqueda(Buscador b) {
        List<Figurita> retorno = new ArrayList<>();
        for(Coleccionable c: this.colecciones)
            retorno.addAll(c.getBusqueda(b));
        Collections.sort(retorno);
        return retorno;
    }

}
