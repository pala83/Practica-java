package P_2023_Quequen.Condiciones;

import P_2023_Quequen.Classes.Coleccionable;

public class CondicionAND implements Condicion{
	private Condicion c1, c2;
	
	public CondicionAND(Condicion cc, Condicion cc2) {
	  this.c1=cc;
	  this.c2=cc2;
	}

    @Override
    public boolean cumple(Coleccionable c) {
        return c1.cumple(c) && c2.cumple(c);
    }
}
