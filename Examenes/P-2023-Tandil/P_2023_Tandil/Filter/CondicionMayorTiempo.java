package P_2023_Tandil.Filter;

import P_2023_Tandil.Classes.Pieza3D;

public class CondicionMayorTiempo implements Condicion{
    private int reqTiempo;

    public CondicionMayorTiempo(int reqTiempo){
        this.reqTiempo = reqTiempo;
    }

    @Override
    public boolean cumple(Pieza3D pieza) {
        return pieza.getTiempoEstimado()>this.reqTiempo;
    }

}
