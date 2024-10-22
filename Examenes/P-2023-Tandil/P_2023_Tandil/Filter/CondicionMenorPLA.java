package P_2023_Tandil.Filter;

import P_2023_Tandil.Classes.Pieza3D;

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
