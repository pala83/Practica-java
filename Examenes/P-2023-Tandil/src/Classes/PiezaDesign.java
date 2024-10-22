package Classes;

import Filter.Condicion;

public class PiezaDesign extends PiezaCompuesta{
    private Condicion c;

    public PiezaDesign(Condicion c, String nombre, String descripcion, int extraPLA, int extraTiempo){
        super(nombre, descripcion, extraPLA, extraTiempo);
        this.c = c;
    }

    @Override
    public void addPieza(Pieza3D nueva) {
        if(this.c.cumple(nueva))
            super.addPieza(nueva);
    }

}
