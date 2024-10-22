package P_2023_Tandil.Filter;

import P_2023_Tandil.Classes.Pieza3D;

public class CondicionColor implements Condicion{
    private String color;
    public CondicionColor(String color){
        this.color = color;
    }

    @Override
    public boolean cumple(Pieza3D p){
        return p.getColores().contains(this.color);
    }
}
