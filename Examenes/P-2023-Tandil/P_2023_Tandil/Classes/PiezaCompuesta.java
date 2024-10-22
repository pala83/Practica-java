package P_2023_Tandil.Classes;

import java.util.ArrayList;
import java.util.List;

import P_2023_Tandil.Filter.Condicion;

public class PiezaCompuesta extends Pieza3D{
    private int extraPLA;
    private int extraTiempo;
    private List<Pieza3D> piezas = new ArrayList<>();

    public PiezaCompuesta(String nombre, String descripcion, int extraPLA, int extraTiempo){
        super(nombre, descripcion);
        this.extraPLA = extraPLA;
        this.extraTiempo = extraTiempo;
    }

    public PiezaCompuesta(String nombre, String descripcion){
        super(nombre, descripcion);
        this.extraPLA = 1;
        this.extraTiempo = 45;
    }

    public void addPieza(Pieza3D nueva){
        this.piezas.add(nueva);
    }

    @Override
    public List<String> getColores(){
        List<String> retorno = new ArrayList<>();
        for(Pieza3D p : this.piezas){
            for(String color: p.getColores())
                if(!retorno.contains(color))
                    retorno.add(color);
        }
        return retorno;
    }

    @Override
    public double getCantPLA() {
        double retorno = 0;
        for(Pieza3D p: this.piezas){
            retorno+=p.getCantPLA();
        }
        return retorno+=this.cantPiezasSimples()*this.extraPLA;
    }

    @Override
    public int cantPiezasSimples(){
        int retorno = 0;
        for(Pieza3D p : this.piezas)
            retorno+=p.cantPiezasSimples();
        return retorno;
    }

    @Override
    public int getTiempoEstimado() {
        int retorno = 0;
        for(Pieza3D p: this.piezas)
            retorno+=p.getTiempoEstimado();
        return retorno+=this.extraTiempo;
    }

    @Override
    public List<Pieza> buscar(Condicion c) {
        List<Pieza> retorno = new ArrayList<>();
        for(Pieza3D pd: this.piezas){
            retorno.addAll(pd.buscar(c));
        }
        return retorno;
    }
}
