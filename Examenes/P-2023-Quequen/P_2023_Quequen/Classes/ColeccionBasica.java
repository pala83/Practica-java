package P_2023_Quequen.Classes;

import P_2023_Quequen.Condiciones.Condicion;

public class ColeccionBasica extends ColeccionTematica{
    private Condicion cond;

    public ColeccionBasica(String nombre, double extra, Condicion cond){
        super(nombre, extra);
        this.cond = cond;
    }

    @Override
    public void addColeccion(Coleccionable nueva) {
        if(cond.cumple(nueva))
            super.addColeccion(nueva);
    }
}
