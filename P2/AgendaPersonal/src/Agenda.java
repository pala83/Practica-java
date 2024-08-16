import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Reunion> reuniones;

    public Agenda(){
        this.reuniones = new ArrayList<>();
    }

    public boolean addReunion(Reunion nueva){
        for(Reunion r: this.reuniones){
            if(r.getHorario().superposicionHoraria(nueva.getHorario()))
                return false;
        }
        this.reuniones.add(nueva);
        return true;
    }

    @Override
    public String toString() {
        int cont = 1;
        String retorno = "";
        for(Reunion r : this.reuniones){
            retorno+= "Reunion " + cont + ":\n" +
                    r.toString() + "\n";
            cont++;
        }
        retorno+= "-----------------------------------------";
        return retorno;
    }

}
