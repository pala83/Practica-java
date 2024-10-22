package Filter;

import Classes.Pieza3D;

public class CondicionNOT implements Condicion{
    private Condicion c;
    public CondicionNOT(Condicion c){
        this.c = c;
    }

    @Override
    public boolean cumple(Pieza3D pieza) {
        return !c.cumple(pieza);
    }
}

