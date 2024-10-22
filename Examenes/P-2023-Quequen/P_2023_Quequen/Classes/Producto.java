package P_2023_Quequen.Classes;

import java.util.ArrayList;
import java.util.List;

import P_2023_Quequen.Condiciones.Condicion;

public class Producto extends Coleccionable{
    private double peso;
    private double volumen;
    private List<String> caracteristicas;

    public Producto(String nombre, double peso, double volumen){
        super(nombre);
        this.peso = peso;
        this.caracteristicas = new ArrayList<>();
    }
    public void addCaracateristica(String nueva){
        this.caracteristicas.add(nueva);
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }
    @Override
    public double getPeso() {
        return this.peso;
    }
    @Override
    public List<String> getCaracteristicas() {
        return List.copyOf(this.caracteristicas);
    }
    @Override
    public int cantidadColeccionables() {
        return 1;
    }

    @Override
    public List<Producto> buscar(Condicion c) {
        List<Producto> retorno = new ArrayList<>();
        if(c.cumple(this))
            retorno.add(this);
        return retorno;
    }
}
