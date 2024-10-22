package Filter;

import Classes.Pieza3D;

public class CondicionAND implements Condicion{
    private Condicion c1,c2;
    public CondicionAND(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pieza3D pieza){
        return c1.cumple(pieza) && c2.cumple(pieza);
    }
}
