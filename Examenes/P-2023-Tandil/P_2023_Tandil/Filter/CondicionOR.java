package P_2023_Tandil.Filter;

import P_2023_Tandil.Classes.Pieza3D;

public class CondicionOR implements Condicion{
    private Condicion c1,c2;
    public CondicionOR(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pieza3D pieza){
        return c1.cumple(pieza) || c2.cumple(pieza);
    }
}

