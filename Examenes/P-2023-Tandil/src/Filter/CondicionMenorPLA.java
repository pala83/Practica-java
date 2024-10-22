package Filter;

import Classes.Pieza3D;

public class CondicionMenorPLA implements Condicion{
    private double reqPLA;
    public CondicionMenorPLA(double reqPLA){
        this.reqPLA = reqPLA;
    }

    @Override
    public boolean cumple(Pieza3D pieza) {
        return pieza.getCantPLA()<this.reqPLA;
    }
}
