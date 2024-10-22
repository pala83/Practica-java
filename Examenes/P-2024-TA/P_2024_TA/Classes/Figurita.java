package P_2024_TA.Classes;

import java.util.ArrayList;
import java.util.List;

import P_2024_TA.Searcher.Buscador;

public class Figurita extends Coleccionable implements Comparable<Figurita>{
    private String album;
    private int numero;
    private double precio;

    public Figurita(String nombre, String album, int numero, double precio){
        super(nombre);
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }
    public int getNumero() {
        return numero;
    }
    public String getAlbum() {
        return album;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public List<Figurita> getBusqueda(Buscador b) {
        List<Figurita> retorno = new ArrayList<>();
        if(b.buscar(this))
            retorno.add(this);
        return retorno;
    }

    @Override
    public int compareTo(Figurita otra) {
        double valor = this.getPrecio() - otra.getPrecio();
        if(valor>0) return 1;
        if(valor<0) return -1;
        return this.getNombre().compareTo(otra.getNombre());
    }
}
