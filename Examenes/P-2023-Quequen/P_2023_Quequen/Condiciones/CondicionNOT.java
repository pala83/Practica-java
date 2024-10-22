package P_2023_Quequen.Condiciones;

import P_2023_Quequen.Classes.Coleccionable;

public class CondicionNOT implements Condicion{
	private Condicion c;
	
	public CondicionNOT(Condicion c) {
	  this.c=c;
	}

    @Override
    public boolean cumple(Coleccionable c) {
        return !this.c.cumple(c);
    }
}
