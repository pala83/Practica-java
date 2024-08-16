import java.time.LocalTime;

public class Horario {
    private LocalTime hInicio;
    private LocalTime hFin;
    private int duracion; // cantidad de minutos

    public Horario(LocalTime hInicio, int duracion){
        this.hInicio = hInicio;
        this.duracion = duracion;
        this.hFin = this.hInicio.plusMinutes(duracion);
    }

    public LocalTime gethInicio() {
        return hInicio;
    }
    public LocalTime gethFin() {
        return hFin;
    }
    public int getDuracion() {
        return duracion;
    }
    public void sethInicio(LocalTime hInicio) {
        this.hInicio = hInicio;
        this.hFin = this.hInicio.plusMinutes(duracion);
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean superposicionHoraria(Horario otro){
        return this.hInicio.isBefore(otro.gethFin()) && otro.gethInicio().isBefore(this.hFin);
    }
}
