package Classes;

import java.util.List;

import Filter.Condicion;

public abstract class Pieza3D {
    private String nombre;
    private String descripcion;
    private static double valorPLA = 10;
    private static double valorSEG = 20;


    public Pieza3D(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public static double getValorPLA() {
        return valorPLA;
    }
    public static double getValorSEG() {
        return valorSEG;
    }
    public static void setValorPLA(double valorPLA) {
        Pieza3D.valorPLA = valorPLA;
    }
    public static void setValorSEG(double valorSEG) {
        Pieza3D.valorSEG = valorSEG;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract List<String> getColores();
    public abstract double getCantPLA();
    public abstract int getTiempoEstimado();
    public abstract int cantPiezasSimples();
    public abstract List<Pieza> buscar(Condicion c);
    
    public double getValor(){
        return this.getCantPLA()*valorPLA + this.getTiempoEstimado()*valorSEG;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.descripcion;
    }

}
