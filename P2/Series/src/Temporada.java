import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private List<Episodio> episodios;

    public Temporada(){
        this.episodios = new ArrayList<>();
    }

    public void addEpisodio(Episodio e){
        this.episodios.add(e);
    }

    public int cantEpisodios(){
        return this.episodios.size();
    }

    public int episodiosVistos(){
        int retorno = 0;
        for(Episodio e : this.episodios){
            if(e.fueVisto()) retorno++;
        }
        return retorno;
    }

    public double calificacion(){
        int vistos = 0;
        int sumaCalificacion = 0;
        for(Episodio e: this.episodios){
            if(e.fueVisto()){
                vistos++;
                sumaCalificacion+=e.getCalificacion();
            }
        }
        return vistos!=0 ? (double)sumaCalificacion/vistos : vistos;
    }

    @Override
    public String toString() {
        int cont = 1;
        String retorno = "";
        for(Episodio e: this.episodios){
            retorno+= "Episodio " + cont + ":\n";
            retorno+= e.toString();
            cont++;
        }
        return retorno;
    }
}
