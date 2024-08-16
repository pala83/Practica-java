import java.util.ArrayList;
import java.util.List;

public class Reunion {
    private String lugar;
    private String tema;
    private Horario horario;
    private List<Contacto> asistentes;

    public Reunion(String lugar, String tema, Horario horario){
        this.lugar = lugar;
        this.tema = tema;
        this.horario = horario;
        this.asistentes = new ArrayList<>();
    }

    public void addAsistente(Contacto nuevo){
        this.asistentes.add(nuevo);
    }

    public String getLugar() {
        return lugar;
    }
    public String getTema() {
        return tema;
    }
    public Horario getHorario() {
        return horario;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        String retorno = "|- L: " + this.lugar + "\n" +
                         "|- T: " + this.tema + "\n" +
                         "|- H: " + this.horario.gethInicio() + " - " + this.horario.gethFin() + "\n" +
                         "|- D: " + this.horario.getDuracion() + "\n" +
                         "|- Asistentes: " + "\n";
        for(Contacto c : this.asistentes){
            retorno+= "| " + c.toString();
        }
        return retorno;
    }
}
