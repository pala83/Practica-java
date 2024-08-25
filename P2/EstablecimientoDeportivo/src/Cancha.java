import java.util.List;

public class Cancha {
    private String deporte;
    private double precioPHora;
    private List<Turno> turnosReservados;

    public Cancha(String deporte, double precioPHora){
        this.deporte = deporte;
        this.precioPHora = precioPHora;
    }

    public String getDeporte() {
        return deporte;
    }
    public double getPrecioPHora() {
        return precioPHora;
    }
    public boolean reservarTurno(Turno nuevo){
        for(Turno t: this.turnosReservados){
            if(!t.getHorario().superposicionHoraria(nuevo.getHorario())){
                this.turnosReservados.add(nuevo);
                return true;
            }
        }
        return false;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public void setPrecioPHora(double precioPHora) {
        this.precioPHora = precioPHora;
    }
}
