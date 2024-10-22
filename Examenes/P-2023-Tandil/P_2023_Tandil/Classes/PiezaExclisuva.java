package P_2023_Tandil.Classes;

import java.util.ArrayList;
import java.util.List;

import P_2023_Tandil.Filter.Condicion;

public class PiezaExclisuva extends Pieza{
    private int valorAgregado;
    public PiezaExclisuva(String nombre, String descripcion, String color, double cantPLA, int tiempoExtimado, int valorAgregado){
        super(nombre, descripcion, color, cantPLA, tiempoExtimado);
        this.valorAgregado = valorAgregado;
    }

    public int getValorAgregado() {
        return valorAgregado;
    }
    public void setValorAgregado(int valorAgregado) {
        this.valorAgregado = valorAgregado;
    }

    @Override
    public double getValor() {
        return super.getValor() + this.valorAgregado;
    }

    @Override
    public List<Pieza> buscar(Condicion c) {
        return new ArrayList<>();
    }
}
