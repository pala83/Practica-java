package Classes;

import java.util.ArrayList;
import java.util.List;

import Filter.Condicion;

public class Pieza extends Pieza3D {
    private String color;
    private double cantPLA;
    private int tiempoEstimado;

    public Pieza(String nombre, String descripcion, String color, double cantPLA, int tiempoEstimado){
        super(nombre, descripcion);
        this.color = color;
        this.cantPLA = cantPLA;
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public double getCantPLA() {
        return this.cantPLA;
    }

    @Override
    public int getTiempoEstimado() {
        return this.tiempoEstimado;
    }

    @Override
    public List<String> getColores() {
        List<String> retorno = new ArrayList<>();
        retorno.add(this.color);
        return retorno;
    }

    @Override
    public int cantPiezasSimples() {
        return 1;
    }

    @Override
    public List<Pieza> buscar(Condicion c) {
        List<Pieza> retorno = new ArrayList<>();
        if(c.cumple(this))
            retorno.add(this);
        return retorno;
    }

}
