package Filter;

import Classes.Pieza3D;

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
