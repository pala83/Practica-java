package P_2023_Quequen.Classes;

import java.util.ArrayList;
import java.util.List;

import P_2023_Quequen.Condiciones.Condicion;

public class ColeccionTematica extends Coleccionable{
    private double extra; // se considera al extra como un vlaor entre 0 y 1
    private List<Coleccionable> colecciones;

    public ColeccionTematica(String nombre, double extra){
        super(nombre);
        this.extra = extra;
        this.colecciones = new ArrayList<>();
    }

    public double getExtra() {
        return extra;
    }
    public void setExtra(double extra) {
        this.extra = extra;
    }
    public void addColeccion(Coleccionable nueva){
        this.colecciones.add(nueva);
    }

    @Override
    public double getPeso() {
        double total = 0;
        for(Coleccionable c: this.colecciones){
            total+=c.getPeso();
        }
        return total;
    }
    @Override
    public double getVolumen() {
        double total = 0;
        for(Coleccionable c: this.colecciones)
            total+=c.getVolumen();
        return total+=total*this.extra;
    }
    @Override
    public List<String> getCaracteristicas() {
        List<String> retorno = new ArrayList<>();
        for(Coleccionable c: this.colecciones){
            for(String caracteristica: c.getCaracteristicas()){
                if(!retorno.contains(caracteristica))
                    retorno.add(caracteristica);
            }
        }
        return retorno;
    }

    @Override
    public int cantidadColeccionables() {
        int total = 0;
        for(Coleccionable c: this.colecciones)
            total+=c.cantidadColeccionables();
        return total;
    }

    @Override
    public List<Producto> buscar(Condicion c) {
        List<Producto> retorno = new ArrayList<>();
        for(Coleccionable colec: this.colecciones)
            retorno.addAll(colec.buscar(c));
        return retorno;
    }

}
