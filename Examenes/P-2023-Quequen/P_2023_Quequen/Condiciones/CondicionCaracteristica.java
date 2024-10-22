package P_2023_Quequen.Condiciones;

import P_2023_Quequen.Classes.Coleccionable;

public class CondicionCaracteristica implements Condicion{
    private String caracteristica;

    public CondicionCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(Coleccionable p) {
        return p.getCaracteristicas().contains(this.caracteristica);
    }
}
