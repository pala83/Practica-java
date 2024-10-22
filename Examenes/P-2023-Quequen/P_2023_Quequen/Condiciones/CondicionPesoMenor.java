package P_2023_Quequen.Condiciones;

import P_2023_Quequen.Classes.Coleccionable;

public class CondicionPesoMenor implements Condicion{
    private double peso;

    public CondicionPesoMenor(double peso){
        this.peso = peso;
    }

    @Override
    public boolean cumple(Coleccionable p) {
        return p.getPeso() < this.peso;
    }
}
