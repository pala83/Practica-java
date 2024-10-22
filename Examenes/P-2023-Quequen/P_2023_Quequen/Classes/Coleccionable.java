package P_2023_Quequen.Classes;

import java.util.List;

import P_2023_Quequen.Condiciones.Condicion;

public abstract class Coleccionable {
    private String nombre;
    private static double precioGramo = 10;
    private static double costoUnidad = 10;

    public Coleccionable(String nombre){
        this.nombre = nombre;
    }

    public static void setCostoUnidad(double costoUnidad) {
        Coleccionable.costoUnidad = costoUnidad;
    }
    public static void setPrecioGramo(double precioGramo) {
        Coleccionable.precioGramo = precioGramo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPeso();
    public abstract double getVolumen();
    public abstract List<String> getCaracteristicas();
    public abstract int cantidadColeccionables();
    public abstract List<Producto> buscar(Condicion c);
}
